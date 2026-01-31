package com.example.cheatmod.mixin;

import com.example.cheatmod.CheatMod;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

	@Inject(method = "damage", at = @At("HEAD"), cancellable = true)
	private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
		if (CheatMod.config != null && CheatMod.config.noDamage) {
			cir.setReturnValue(false);
		}
	}

	@Inject(method = "tick", at = @At("HEAD"))
	private void onTick(CallbackInfo ci) {
		PlayerEntity player = (PlayerEntity) (Object) this;

		if (CheatMod.config != null && CheatMod.config.unlimitedBreath) {
			player.setAir(player.getMaxAir());
		}

		if (CheatMod.config != null && CheatMod.config.maxScore) {
			if (player.experienceLevel < 10000) {
				player.experienceLevel = 10000;
			}
		}
	}
}
