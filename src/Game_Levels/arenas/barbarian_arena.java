package Game_Levels.arenas;

import Game_Levels.game_level;
import engine.unlocking_variables;

import static Game_Levels.game_level.arena.arenas;

public class barbarian_arena extends game_level {

    public static game_level.arena barbarianArena;
    public static unlocking_variables unlockingBarbarianArena;

    protected barbarian_arena(game_level levelType, boolean hasBoss, boolean levelContainsPets, boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        super(arenas, false, false, false, false, false, true);
    }
}
