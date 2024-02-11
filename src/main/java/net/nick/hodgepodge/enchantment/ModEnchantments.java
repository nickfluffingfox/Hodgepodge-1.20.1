package net.nick.hodgepodge.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nick.hodgepodge.Hodgepodge;

public class ModEnchantments {

    public static Enchantment BUTCHERING = register("butchering",
            new ButcheringEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(Hodgepodge.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Hodgepodge.MOD_ID);
    }
}
