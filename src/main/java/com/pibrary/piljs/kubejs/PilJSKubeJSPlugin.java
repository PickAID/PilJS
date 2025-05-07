package com.pibrary.piljs.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;

public class PilJSKubeJSPlugin extends KubeJSPlugin {
    @Override
    public void registerEvents() {
        PilJSKubeJSEvents.START_GROUP.register();
        PilJSKubeJSEvents.SERVER_GROUP.register();
        PilJSKubeJSEvents.CLIENT_GROUP.register();
    }
}

