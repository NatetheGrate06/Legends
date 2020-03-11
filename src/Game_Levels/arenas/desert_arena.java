package Game_Levels.arenas;

import Game_Levels.game_level;

import static Game_Levels.game_level.arena.arenas;

public class desert_arena extends game_level {

    public static game_level.arena desertArena;

    protected desert_arena(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        super(arenas, false, false, false, false, false, true);
    }
}
