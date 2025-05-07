package com.pibrary.piljs.kubejs.events.client.levelrender;

import dev.latvian.mods.kubejs.client.ClientEventJS;
import net.minecraft.resources.ResourceLocation;

public class LevelTextureEventJS extends ClientEventJS {
    public ResourceLocation sunTexture = new ResourceLocation("textures/environment/sun.png");
    public ResourceLocation moonTexture = new ResourceLocation("textures/environment/moon.png");
    public ResourceLocation rainTexture = new ResourceLocation("textures/environment/rain.png");
    public ResourceLocation snowTexture = new ResourceLocation("textures/environment/snow.png");

    public void setSun(ResourceLocation resourceLocation) {
        this.sunTexture = resourceLocation;
    }

    public void setMoon(ResourceLocation resourceLocation) {
        this.moonTexture = resourceLocation;
    }

    public void setRain(ResourceLocation resourceLocation) {
        this.rainTexture = resourceLocation;
    }

    public void setSnow(ResourceLocation resourceLocation) {
        this.snowTexture = resourceLocation;
    }
}
