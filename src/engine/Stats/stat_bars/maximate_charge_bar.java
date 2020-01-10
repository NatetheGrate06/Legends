package engine.Stats.stat_bars;


import engine.Player.player;

import java.awt.*;
import java.util.Collections;
import java.util.function.Function;

import static engine.Player.player.isPlayerInLevel;
import static engine.Stats.stat_bars.charge.CHARGE;

public class maximate_charge_bar extends bar {

    public static double maximateCharge = charge.chargeSpeed()[0];
    public static boolean fullCharge = maximateCharge == 100;
    public static double maximateDepletionSpeed = charge.depletionSpeed()[0];
    protected Object maximateBar = new Dimension(50, 10);

    public static boolean isChargeReady(boolean b) {
        if(fullCharge = true) {
            isChargeReady(true);
        }
        return fullCharge;
    }

    public Comparable<Boolean> main(String[] args) {

        if(isChargeReady(true)) {
            return player.notifyPlayer;
        }

        return null;
    }

    public Function showStaminaBar() {
        if (isPlayerInLevel(true)) {
            return (Function) maximateBar;
        }
        return showBar();
    }
}
