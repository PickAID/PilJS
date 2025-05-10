package com.pibrary.piljs.kubejs;

import com.pibrary.piljs.kubejs.events.client.levelrender.LevelTextureEventJS;
import com.pibrary.piljs.kubejs.events.server.ConfiguredKeyEventJS;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;

public interface PilJSKubeJSEvents {
    EventGroup START_GROUP = EventGroup.of("PilJSStart");
    EventGroup SERVER_GROUP = EventGroup.of("PilJSServer");
    EventGroup CLIENT_GROUP = EventGroup.of("PilJSClient");

    EventHandler LEVEL_TEXTURE = CLIENT_GROUP.client("levelTexture", () -> LevelTextureEventJS.class);

    EventHandler PRESSED = SERVER_GROUP.server("keyPressed", () -> ConfiguredKeyEventJS.Pressed.class);
    EventHandler CHARGING = SERVER_GROUP.server("charging", () -> ConfiguredKeyEventJS.Charginng.class);
    EventHandler RELEASED = SERVER_GROUP.server("released", () -> ConfiguredKeyEventJS.Released.class);
    EventHandler FINISHED = SERVER_GROUP.server("finished", () -> ConfiguredKeyEventJS.Finished.class);
    EventHandler TIME_OUT = SERVER_GROUP.server("timeOut", () -> ConfiguredKeyEventJS.TimeOut.class);
    EventHandler COMBO_STEP = SERVER_GROUP.server("comboStep", () -> ConfiguredKeyEventJS.CompoStep.class);
}
