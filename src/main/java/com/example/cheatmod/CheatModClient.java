package com.example.cheatmod;

import net.fabricmc.api.ClientModInitializer;

public class CheatModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CheatMod.LOGGER.info("Cheat Mod Client initialized!");
	}
}
