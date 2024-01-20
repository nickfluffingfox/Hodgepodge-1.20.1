package net.nick.hodgepodge.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nick.hodgepodge.Hodgepodge;

public class ModBlocks {

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block STEEL_BARS = registerBlock("steel_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block STEEL_ROD = registerBlock("steel_rod",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block STEEL_GRATE = registerBlock("steel_grate",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.IRON_GRAY)
                    .requiresTool().strength(6.0f).nonOpaque().sounds(BlockSoundGroup.NETHERITE)
                    .allowsSpawning(Blocks::never), BlockSetType.STONE));

    public static final Block STEEL_LANTERN = registerBlock("steel_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));

    public static final Block PLANTER_BARREL = registerBlock("planter_barrel",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOD)));

private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Hodgepodge.MOD_ID, name), block );
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Hodgepodge.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Hodgepodge.LOGGER.debug("Registering Mod Blocks for " + Hodgepodge.MOD_ID);
    }
}
