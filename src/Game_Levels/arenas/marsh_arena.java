package Game_Levels.arenas;

import Game_Levels.game_level;

public class marsh_arena extends game_level {

    public static game_level.arena marshArena;

    protected marsh_arena(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        super(arena.arenas, false, false, false, false, false, true);
    }
}
