package Game_Levels.arenas;

import Game_Levels.game_level;
import engine.unlocking_variables;

public class cloud_arena extends game_level {

    public static unlocking_variables unlockingCloudArena;
    public static game_level.arena cloudArena;

    protected cloud_arena(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        super(arena.arenas, false, false, false, false, false, true);
    }
}
