package com.example.cheatmod;

import com.example.cheatmod.config.ModConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheatMod implements ModInitializer {
	public static final String MOD_ID = "cheatmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static ModConfig config;

	@Override
	public void onInitialize() {
		config = ModConfig.load();
		config.save();
		LOGGER.info("Cheat Mod initialized!");
	}
}
