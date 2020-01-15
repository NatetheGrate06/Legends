package engine.Stats.player_stats;

import engine.Magic.maximate;
import engine.Player.level_up_points;

import static engine.Stats.stat_bars.maximate_charge_bar.maximateCharge;

public class player_maximate extends player_stat {

    public int maximateDamage;
    public static int maximateLevel = filledMaximateSlot();
    public static int maximateLevelUp = maximateLevel + 1;
    public static int maximateLevelBoost = (int) (maximateCharge + 1);
    public static boolean didMaximateLevelUp; {
        if (didMaximateLevelUp = true) {
            maximateLevelUp = maximateLevelUp;
            maximateLevelBoost = maximateLevelBoost;
            maximate.maximateRecharge = (int) (maximate.maximateRecharge - 0.5);
        }
    }

    public int getPlayerMaximate() {
        return playerMaximate;
    }

    public static int filledMaximateSlot() {
        return level_up_points.maximatePointSlots;
    }
}
