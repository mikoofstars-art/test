package com.example.cheatmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheatMod implements ModInitializer {
	public static final String MOD_ID = "cheatmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static boolean noDamage = true;
	public static boolean unlimitedBreath = true;
	public static boolean oneHitKill = true;
	public static boolean indestructibleTools = true;
	public static boolean maxScore = true;
	public static boolean maxInventorySize = true;

	@Override
	public void onInitialize() {
		LOGGER.info("Cheat Mod initialized!");
	}
}
