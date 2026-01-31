package com.example.cheatmod;

import com.example.cheatmod.gui.CheatModScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class CheatModClient implements ClientModInitializer {
	private static KeyBinding openMenuKey;

	@Override
	public void onInitializeClient() {
		openMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
			"key.cheatmod.open_menu",
			InputUtil.Type.KEYSYM,
			GLFW.GLFW_KEY_U,
			"category.cheatmod"
		));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (openMenuKey.wasPressed()) {
				client.setScreen(new CheatModScreen(client.currentScreen));
			}
		});

		CheatMod.LOGGER.info("Cheat Mod Client initialized!");
	}
}
