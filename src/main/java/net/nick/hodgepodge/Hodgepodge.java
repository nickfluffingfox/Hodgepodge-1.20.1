package net.nick.hodgepodge;

import net.fabricmc.api.ModInitializer;

import net.nick.hodgepodge.block.ModBlocks;
import net.nick.hodgepodge.enchantment.ModEnchantments;
import net.nick.hodgepodge.item.ModItemGroups;
import net.nick.hodgepodge.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hodgepodge implements ModInitializer {
	public static final String MOD_ID = "hodgepodge";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModEnchantments.registerModEnchantments();
	}
}