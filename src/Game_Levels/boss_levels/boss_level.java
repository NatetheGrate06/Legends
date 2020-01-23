package Game_Levels.boss_levels;

import Game_Levels.game_level;

import java.util.ArrayList;

public class boss_level extends game_level {

    //TODO finish this array list
    public static boss_level bossLevels; {
        ArrayList<boss_level> bossLevels = new ArrayList<>();
        bossLevels.add(cyclops_boss_level.cyclopsBossLevel);
    }
}
