package engine.Stats.player_stats;

import engine.Player.level_up_points;

public class player_defense extends player_stat {

    public static int playerHealth;
    public int defense;
    public static int defenseLevel = filledDefenseSlot();
    public int health;

    public static player_defense getPlayerDefense() {
        return (player_defense) playerDefense;
    }

    public static int givePlayerHealth() {
        return playerHealth;
    }

    public int getPlayerHealth() {
        return health;
    }

    public static int filledDefenseSlot() {
        return level_up_points.defensePointSlots;
    }
}
