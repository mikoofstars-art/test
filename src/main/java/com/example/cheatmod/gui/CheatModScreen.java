package com.example.cheatmod.gui;

import com.example.cheatmod.CheatMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class CheatModScreen extends Screen {
	private final Screen parent;

	public CheatModScreen(Screen parent) {
		super(Text.literal("Cheat Mod Settings"));
		this.parent = parent;
	}

	@Override
	protected void init() {
		super.init();

		int centerX = this.width / 2;
		int startY = 50;
		int buttonWidth = 200;
		int buttonHeight = 20;
		int spacing = 25;

		addDrawableChild(ButtonWidget.builder(
			getButtonText("No Damage", CheatMod.config.noDamage),
			button -> {
				CheatMod.config.noDamage = !CheatMod.config.noDamage;
				button.setMessage(getButtonText("No Damage", CheatMod.config.noDamage));
				CheatMod.config.save();
			}
		).dimensions(centerX - buttonWidth / 2, startY, buttonWidth, buttonHeight).build());

		addDrawableChild(ButtonWidget.builder(
			getButtonText("Unlimited Breath", CheatMod.config.unlimitedBreath),
			button -> {
				CheatMod.config.unlimitedBreath = !CheatMod.config.unlimitedBreath;
				button.setMessage(getButtonText("Unlimited Breath", CheatMod.config.unlimitedBreath));
				CheatMod.config.save();
			}
		).dimensions(centerX - buttonWidth / 2, startY + spacing, buttonWidth, buttonHeight).build());

		addDrawableChild(ButtonWidget.builder(
			getButtonText("One Hit Kill", CheatMod.config.oneHitKill),
			button -> {
				CheatMod.config.oneHitKill = !CheatMod.config.oneHitKill;
				button.setMessage(getButtonText("One Hit Kill", CheatMod.config.oneHitKill));
				CheatMod.config.save();
			}
		).dimensions(centerX - buttonWidth / 2, startY + spacing * 2, buttonWidth, buttonHeight).build());

		addDrawableChild(ButtonWidget.builder(
			getButtonText("Indestructible Tools", CheatMod.config.indestructibleTools),
			button -> {
				CheatMod.config.indestructibleTools = !CheatMod.config.indestructibleTools;
				button.setMessage(getButtonText("Indestructible Tools", CheatMod.config.indestructibleTools));
				CheatMod.config.save();
			}
		).dimensions(centerX - buttonWidth / 2, startY + spacing * 3, buttonWidth, buttonHeight).build());

		addDrawableChild(ButtonWidget.builder(
			getButtonText("Max Score", CheatMod.config.maxScore),
			button -> {
				CheatMod.config.maxScore = !CheatMod.config.maxScore;
				button.setMessage(getButtonText("Max Score", CheatMod.config.maxScore));
				CheatMod.config.save();
			}
		).dimensions(centerX - buttonWidth / 2, startY + spacing * 4, buttonWidth, buttonHeight).build());

		addDrawableChild(ButtonWidget.builder(
			getButtonText("Max Inventory Size", CheatMod.config.maxInventorySize),
			button -> {
				CheatMod.config.maxInventorySize = !CheatMod.config.maxInventorySize;
				button.setMessage(getButtonText("Max Inventory Size", CheatMod.config.maxInventorySize));
				CheatMod.config.save();
			}
		).dimensions(centerX - buttonWidth / 2, startY + spacing * 5, buttonWidth, buttonHeight).build());

		addDrawableChild(ButtonWidget.builder(
			Text.literal("Done"),
			button -> this.close()
		).dimensions(centerX - buttonWidth / 2, startY + spacing * 7, buttonWidth, buttonHeight).build());
	}

	private Text getButtonText(String name, boolean enabled) {
		return Text.literal(name + ": " + (enabled ? "§aON" : "§cOFF"));
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY, float delta) {
		super.render(context, mouseX, mouseY, delta);
		context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 20, 0xFFFFFF);
	}

	@Override
	public void close() {
		if (this.client != null) {
			this.client.setScreen(this.parent);
		}
	}
}
