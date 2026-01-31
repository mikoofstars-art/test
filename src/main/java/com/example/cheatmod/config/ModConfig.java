package com.example.cheatmod.config;

import com.example.cheatmod.CheatMod;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfig {
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private static final File CONFIG_FILE = new File(
		FabricLoader.getInstance().getConfigDir().toFile(),
		"cheatmod.json"
	);

	public boolean noDamage = true;
	public boolean unlimitedBreath = true;
	public boolean oneHitKill = true;
	public boolean indestructibleTools = true;
	public boolean maxScore = true;
	public boolean maxInventorySize = true;

	public static ModConfig load() {
		if (CONFIG_FILE.exists()) {
			try (FileReader reader = new FileReader(CONFIG_FILE)) {
				return GSON.fromJson(reader, ModConfig.class);
			} catch (IOException e) {
				CheatMod.LOGGER.error("Failed to load config, using defaults", e);
			}
		}
		return new ModConfig();
	}

	public void save() {
		try {
			CONFIG_FILE.getParentFile().mkdirs();
			try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
				GSON.toJson(this, writer);
			}
			CheatMod.LOGGER.info("Config saved successfully");
		} catch (IOException e) {
			CheatMod.LOGGER.error("Failed to save config", e);
		}
	}
}
