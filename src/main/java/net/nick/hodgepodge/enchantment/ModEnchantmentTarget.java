package net.nick.hodgepodge.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.nick.hodgepodge.item.ModItems;

public enum ModEnchantmentTarget extends EnchantmentTarget {

    BUTCHER_ITEM{
        public boolean isAcceptableItem(Item item) {
            return item instanceof AxeItem;
        }
    }
}
