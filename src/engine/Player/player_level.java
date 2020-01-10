package engine.Player;

import engine.Stats.player_stats.*;

import java.util.ArrayList;


import static engine.Stats.player_stats.player_agility.agilityLevel;
import static engine.Stats.player_stats.player_agility.getFilledAgilitySlot;
import static engine.Stats.player_stats.player_attack.attackLevel;
import static engine.Stats.player_stats.player_attack.filledAttackSlot;
import static engine.Stats.player_stats.player_defense.defenseLevel;
import static engine.Stats.player_stats.player_defense.filledDefenseSlot;
import static engine.Stats.player_stats.player_magic.filledMagicSlot;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.player_stats.player_maximate.filledMaximateSlot;
import static engine.Stats.player_stats.player_maximate.maximateLevel;
import static engine.Stats.player_stats.player_stamina.filledStaminaSlot;
import static engine.Stats.player_stats.player_stamina.staminaLevel;

public class player_level {

    public int startingLevel = 1;
    public static int playerLevel;
    public static int playerLevelBoost = (int) (playerLevel * 1.5);
    public static int playerLevelUp = playerLevel + 1;

    public static int[] statLevel; {
        ArrayList<Integer> statLevel = new ArrayList<>();
        statLevel.add(player_magic.magicLevel);
        statLevel.add(player_defense.defenseLevel);
        statLevel.add(player_attack.attackLevel);
        statLevel.add(player_agility.agilityLevel);
        statLevel.add(player_maximate.maximateLevel);
        statLevel.add(player_stamina.staminaLevel);
    }

    public static int[] statLevelBoost() {
        statLevelBoost()[0] = magicLevel + playerLevelBoost;
        statLevelBoost()[1] = defenseLevel + playerLevelBoost;
        statLevelBoost()[2] = attackLevel + playerLevelBoost;
        statLevelBoost()[3] = agilityLevel + playerLevelBoost;
        statLevelBoost()[4] = maximateLevel + playerLevelBoost;
        statLevelBoost()[5] = staminaLevel + playerLevelBoost;
        return statLevel;
    }
}
