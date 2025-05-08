package com.pibrary.piljs.kubejs.events.client.levelrender;

import dev.latvian.mods.kubejs.client.ClientEventJS;
import net.minecraft.resources.ResourceLocation;

public class LevelTextureEventJS extends ClientEventJS {
    public ResourceLocation sunTexture = null;
    public ResourceLocation moonTexture = null;;
    public ResourceLocation rainTexture = null;;
    public ResourceLocation snowTexture = null;;

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
