package me.smajslo.unscrollifyhotbar.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.smajslo.unscrollifyhotbar.McMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.InventoryPlayer;

@Mixin(InventoryPlayer.class)
public class PlayerInventoryMixinHead {
    @Inject(method="changeCurrentItem",at=@At("HEAD"))
    public void changeCurrentItem(int direction, CallbackInfo ci){
        McMod.previousHotbarPos=Minecraft.getMinecraft().thePlayer.inventory.currentItem;
    }
}
