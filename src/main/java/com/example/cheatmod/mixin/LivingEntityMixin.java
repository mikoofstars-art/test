package com.example.cheatmod.mixin;

import com.example.cheatmod.CheatMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

	@ModifyVariable(method = "damage", at = @At("HEAD"), argsOnly = true, ordinal = 0)
	private float modifyDamageAmount(float amount, DamageSource source) {
		if (CheatMod.oneHitKill && source.getAttacker() instanceof PlayerEntity) {
			LivingEntity target = (LivingEntity) (Object) this;
			if (!(target instanceof PlayerEntity)) {
				return target.getMaxHealth() + 1000.0F;
			}
		}
		return amount;
	}
}
