package net.nick.hodgepodge.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nick.hodgepodge.Hodgepodge;
import net.nick.hodgepodge.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BOUNTIFULHARVEST = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Hodgepodge.MOD_ID, "bountifulharvest"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.bountifulharvest"))
                    .icon(() -> new ItemStack(ModItems.STEEL_CLEAVER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_BLEND);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_BARS);
                        entries.add(ModBlocks.STEEL_GRATE);
                        entries.add(ModBlocks.STEEL_ROD);
                        entries.add(ModBlocks.PLANTER_BARREL);
                        entries.add(ModBlocks.STEEL_LANTERN);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.STEEL_CLEAVER);
                        entries.add(ModItems.STEEL_SICKLE);
                        entries.add(ModItems.SHARPENED_STEEL_CLEAVER);
                        entries.add(ModItems.SHARPENED_STEEL_SICKLE);
                    }).build());

    public static void registerItemGroups() {
        Hodgepodge.LOGGER.info("Registering Item Groups for " + Hodgepodge.MOD_ID);
    }
}