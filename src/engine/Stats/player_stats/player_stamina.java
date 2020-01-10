package engine.Stats.player_stats;

import engine.Items.consumables.stamina_potion;
import engine.Player.level_up_points;
import engine.Player.player;
import engine.Stats.stat_bars.stamina_bar;

public class player_stamina extends player_stat {

    public static int staminaLevel = filledStaminaSlot();
    public static double stamina = (getStaminaLevel() + stamina_potion.staminaBoost);
    public static double staminaLost = (player.distanceRan * stamina_bar.staminaDepletion);
    public static double currentPlayerStamina = stamina - staminaLost;

    public static int getPlayerStamina() {
        return playerStamina;
    }

    public static int getStaminaLevel() {
        return staminaLevel;
    }

    public static int filledStaminaSlot() {
        return level_up_points.staminaPointSlots;
    }
}
