package net.nick.bountifulharvest;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BountifulHarvest implements ModInitializer {
	public static final String MOD_ID = "bountifulharvest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Sup Bitches B3");
	}
}