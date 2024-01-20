package net.nick.hodgepodge.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.nick.hodgepodge.Hodgepodge;
import net.nick.hodgepodge.item.custom.SteelSickleItem;

public class ModItems {

    public static final Item STEEL_BLEND = registerItem("steel_blend",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)));

    public static final Item STEEL_CLEAVER = registerItem("steel_cleaver",
            new AxeItem(ModToolMaterials.STEEL, 2, -2.4F,
                    new FabricItemSettings().rarity(Rarity.COMMON).maxCount(1)));
    public static final Item STEEL_SICKLE = registerItem("steel_sickle",
            new HoeItem(ModToolMaterials.STEEL, 0, -2.2F,
                    new FabricItemSettings().rarity(Rarity.COMMON).maxCount(1)));

    public static final Item SHARPENED_STEEL_CLEAVER = registerItem("sharpened_steel_cleaver",
            new AxeItem(ModToolMaterials.STEEL, 4, -2.4F,
                    new FabricItemSettings().rarity(Rarity.COMMON).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Hodgepodge.MOD_ID, name), item );
    }
    public static void registerModItems() {
        Hodgepodge.LOGGER.debug("Registering Mod Items for " + Hodgepodge.MOD_ID);
    }
}
