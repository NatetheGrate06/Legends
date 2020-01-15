package engine.Stats.player_stats;

import engine.Player.level_up_points;
import engine.Stats.stat_bars.mana_bar;

import static engine.Stats.player_stats.player_stat.playerMagic;

public class player_magic extends player_stat {

    public static mana_bar mana;
    public static int magicLevel = filledMagicSlot();
    public static int magicLevelUp = magicLevel + 1;
    public static boolean didMagicLevelUp; {
        if (didMagicLevelUp = true) {
            magicLevelBoost = magicDamage + 1;
            magicLevelUp = magicLevelUp;
        }
    }
    public static int magicDamage;
    public static int magicLevelBoost = magicDamage + 1;

    public static int getPlayerMagic() {
        return playerMagic;
    }

    public static int filledMagicSlot() {
        return level_up_points.magicPointSlots;
    }
}
