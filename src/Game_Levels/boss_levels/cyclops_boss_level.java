package Game_Levels.boss_levels;

import Game_Levels.game_level;
import engine.unlocking_variables;

public class cyclops_boss_level extends game_level {

    public static unlocking_variables unlockingCyclopsBossLevel;
    public static boss_level cyclopsBossLevel;

    protected cyclops_boss_level(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies) {
        super(levelType, hasBoss, levelContainsPets, levelContainsWeapons, hasItem, hasBeefyEnemies, false);
    }
}
