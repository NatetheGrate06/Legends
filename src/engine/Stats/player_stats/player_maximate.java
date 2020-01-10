package engine.Stats.player_stats;

import engine.Player.level_up_points;

public class player_maximate extends player_stat {

    public int maximateDamage;
    public static int maximateLevel = filledMaximateSlot();

    public int getPlayerMaximate() {
        return playerMaximate;
    }

    public static int filledMaximateSlot() {
        return level_up_points.maximatePointSlots;
    }
}
