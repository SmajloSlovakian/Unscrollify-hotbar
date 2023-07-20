package me.smajslo.unscrollifyhotbar.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.smajslo.unscrollifyhotbar.McMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.InventoryPlayer;

@Mixin(InventoryPlayer.class)
public class PlayerInventoryMixinTail {
    @Inject(method="changeCurrentItem",at=@At("TAIL"))
    public void changeCurrentItem(int direction, CallbackInfo ci){
        Minecraft.getMinecraft().thePlayer.inventory.currentItem=McMod.previousHotbarPos;
    }
}
