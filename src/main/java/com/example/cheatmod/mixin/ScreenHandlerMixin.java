package com.example.cheatmod.mixin;

import com.example.cheatmod.CheatMod;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ScreenHandler.class)
public abstract class ScreenHandlerMixin {

	@Inject(method = "onSlotClick", at = @At("RETURN"))
	private void onSlotClick(int slotIndex, int button, SlotActionType actionType, CallbackInfo ci) {
		if (CheatMod.config != null && CheatMod.config.maxInventorySize) {
			ScreenHandler handler = (ScreenHandler) (Object) this;
			if (slotIndex >= 0 && slotIndex < handler.slots.size()) {
				ItemStack stack = handler.slots.get(slotIndex).getStack();
				if (!stack.isEmpty() && stack.getCount() < stack.getMaxCount()) {
					stack.setCount(stack.getMaxCount());
				}
			}
		}
	}
}
