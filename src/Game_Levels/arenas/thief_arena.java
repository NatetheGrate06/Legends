package Game_Levels.arenas;

import Game_Levels.game_level;
import engine.unlocking_variables;

public class thief_arena extends game_level {

    public static unlocking_variables unlockingThiefArena;
    public static game_level.arena thiefArena;

    protected thief_arena(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        super(arena.arenas, hasBoss, levelContainsPets, levelContainsWeapons, hasItem, hasBeefyEnemies, hasWaves);
    }
}
