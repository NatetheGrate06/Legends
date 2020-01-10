package engine.Stats.player_stats;

import engine.Player.level_up_points;

public class player_agility extends player_stat {

    public player_agility agility;
    public static int agilityLevel = getFilledAgilitySlot();

    public static player_agility getPlayerAgility() {
        return (player_agility) playerAgility;
    }

    public static int getFilledAgilitySlot() {
        return level_up_points.agilityPointSlots;
    }
}
