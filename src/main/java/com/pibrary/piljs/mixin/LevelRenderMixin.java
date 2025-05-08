package com.pibrary.piljs.mixin;

import com.pibrary.piljs.kubejs.PilJSKubeJSEvents;
import com.pibrary.piljs.kubejs.events.client.levelrender.LevelTextureEventJS;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LevelRenderer.class)
public abstract class LevelRenderMixin {
    @ModifyArg(method = "renderSky", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V", ordinal = 0), index = 1)
    private ResourceLocation piljs$setSunTexture(ResourceLocation arg) {
        LevelTextureEventJS event = new LevelTextureEventJS();
        PilJSKubeJSEvents.LEVEL_TEXTURE.post(event);
        try {
            if (event.sunTexture != null) {
                return event.sunTexture;
            }
        } catch (Exception ignored) {}
        return arg;
    }

    @ModifyArg(method = "renderSky", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V", ordinal = 1), index = 1)
    private ResourceLocation piljs$setMoonTexture(ResourceLocation arg) {
        LevelTextureEventJS event = new LevelTextureEventJS();
        PilJSKubeJSEvents.LEVEL_TEXTURE.post(event);
        try {
            if (event.moonTexture != null) {
                return event.moonTexture;
            }
        } catch (Exception ignored) {}
        return arg;
    }

    @ModifyArg(method = "renderSnowAndRain", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V", ordinal = 0), index = 1)
    private ResourceLocation piljs$setRainTexture(ResourceLocation arg) {
        LevelTextureEventJS event = new LevelTextureEventJS();
        PilJSKubeJSEvents.LEVEL_TEXTURE.post(event);
        try {
            if (event.rainTexture != null) {
                return event.rainTexture;
            }
        } catch (Exception ignored) {}
        return arg;
    }

    @ModifyArg(method = "renderSnowAndRain", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V", ordinal = 1), index = 1)
    private ResourceLocation piljs$setSnowTexture(ResourceLocation arg) {
        LevelTextureEventJS event = new LevelTextureEventJS();
        PilJSKubeJSEvents.LEVEL_TEXTURE.post(event);
        try {
            if (event.snowTexture != null) {
                return event.snowTexture;
            }
        } catch (Exception ignored) {}
        return arg;
    }
}
