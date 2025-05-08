package com.pibrary.piljs.kubejs;

import com.pibrary.piljs.kubejs.events.client.levelrender.LevelTextureEventJS;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;

public interface PilJSKubeJSEvents {
    EventGroup START_GROUP = EventGroup.of("PilJSStart");
    EventGroup SERVER_GROUP = EventGroup.of("PilJSServer");
    EventGroup CLIENT_GROUP = EventGroup.of("PilJSClient");

    EventHandler LEVEL_TEXTURE = CLIENT_GROUP.client("levelTexture", () -> LevelTextureEventJS.class);
}
