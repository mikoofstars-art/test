package com.example.cheatmod.mixin;

import com.example.cheatmod.CheatMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

	@Inject(method = "damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V", at = @At("HEAD"), cancellable = true)
	private void preventDamage(int amount, LivingEntity entity, CallbackInfo ci) {
		if (CheatMod.indestructibleTools) {
			ci.cancel();
		}
	}
}
