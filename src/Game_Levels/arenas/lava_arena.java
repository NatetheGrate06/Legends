package Game_Levels.arenas;

import Game_Levels.game_level;

public class lava_arena extends game_level {

    public static game_level.arena lavaArena;

    protected lava_arena(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        super(levelType, hasBoss, levelContainsPets, levelContainsWeapons, hasItem, hasBeefyEnemies, hasWaves);
    }
}
