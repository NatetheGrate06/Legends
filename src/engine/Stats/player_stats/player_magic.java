package engine.Stats.player_stats;

import engine.Player.level_up_points;
import engine.Player.magic_level;
import engine.Stats.stat_bars.mana_bar;

import java.util.ArrayList;

import static engine.Stats.player_stats.player_stat.playerMagic;

public class player_magic extends player_stat {

    public static mana_bar mana;
    public static int magicLevelUp = getMagicLevel() + 1;
    public static int magicDamage;
    public static int magicLevelBoost = magicDamage + 1;

    public static boolean didMagicLevelUp; {
        if (didMagicLevelUp = true) {
            magicLevelBoost = magicDamage + 1;
            magicLevelUp = magicLevelUp;
        }
    }

    public static int magicLevel; {
        ArrayList<Integer> MagicLevel = new ArrayList<>();
        MagicLevel.add(magic_level.magicLevel0);
        MagicLevel.add(magic_level.magicLevel1);
        MagicLevel.add(magic_level.magicLevel2);
        MagicLevel.add(magic_level.magicLevel3);
        MagicLevel.add(magic_level.magicLevel4);
        MagicLevel.add(magic_level.magicLevel5);
        MagicLevel.add(magic_level.magicLevel6);
        MagicLevel.add(magic_level.magicLevel7);
        MagicLevel.add(magic_level.magicLevel8);
        MagicLevel.add(magic_level.magicLevel9);
        MagicLevel.add(magic_level.magicLevel10);
        MagicLevel.add(magic_level.magicLevel11);
        MagicLevel.add(magic_level.magicLevel12);
        MagicLevel.add(magic_level.magicLevel13);
        MagicLevel.add(magic_level.magicLevel14);
        MagicLevel.add(magic_level.magicLevel15);
        MagicLevel.add(magic_level.magicLevel16);
        MagicLevel.add(magic_level.magicLevel17);
        MagicLevel.add(magic_level.magicLevel18);
        MagicLevel.add(magic_level.magicLevel19);
        MagicLevel.add(magic_level.magicLevel20);
        MagicLevel.add(magic_level.magicLevel21);
        MagicLevel.add(magic_level.magicLevel22);
        MagicLevel.add(magic_level.magicLevel23);
        MagicLevel.add(magic_level.magicLevel24);
    }
    public static int getPlayerMagic() {
        return playerMagic;
    }

    public static int filledMagicSlot() {
        return level_up_points.magicPointSlots;
    }

    public static int getMagicLevel() {
        return magicLevel;
    }

    public static int getMagicLevelRequirement() {
        return magicLevel;
    }
}
