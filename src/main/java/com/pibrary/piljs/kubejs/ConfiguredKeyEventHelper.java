package com.pibrary.piljs.kubejs;

import net.minecraft.world.entity.player.Player;
import org.pickaid.pibrary.content.key.KeyData;
import org.pickaid.piljs.kubejs.events.server.ConfiguredKeyEventJS;

public class ConfiguredKeyEventHelper {

    public static void pressed(Player player, KeyData keyData) {
        var kjs_pressed_event = new ConfiguredKeyEventJS.Pressed(player, keyData);
        PiEventS.PRESSED.post(kjs_pressed_event);
    }

    public static void charging(Player player, KeyData keyData) {
        var kjs_charging_event = new ConfiguredKeyEventJS.Charginng(player, keyData);
        PiEventS.CHARGING.post(kjs_charging_event);
    }

    public static void released(Player player, KeyData keyData) {
        var kjs_released_event = new ConfiguredKeyEventJS.Released(player, keyData);
        PiEventS.RELEASED.post(kjs_released_event);
    }

    public static void finished(Player player, KeyData keyData) {
        var kjs_finished_event = new ConfiguredKeyEventJS(player, keyData);
        PiEventS.FINISHED.post(kjs_finished_event);
    }

    public static void comboStep(Player player, KeyData keyData, int comboStep) {
        keyData.comboStep = comboStep;
        var kjs_combo_step_event = new ConfiguredKeyEventJS(player, keyData);
        PiEventS.COMBO_STEP.post(kjs_combo_step_event);
    }

    public static void timeOut(Player player, KeyData keyData) {
        var kjs_time_out_event = new ConfiguredKeyEventJS(player, keyData);
        PiEventS.TIME_OUT.post(kjs_time_out_event);
    }
}
