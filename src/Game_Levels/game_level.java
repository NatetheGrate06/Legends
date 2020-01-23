package Game_Levels;

import Game_Levels.arenas.arena;
import Game_Levels.boss_levels.boss_level;
import engine.ShopsAndItemValues.Shops.shop;

import java.util.ArrayList;

public class game_level {

    public static game_level gameLevel;

    //TODO finish this array list
    public static game_level normal_levels; {
        ArrayList<game_level> normal_levels = new ArrayList<>();

    }

    public static game_level getGameLevel; {
        ArrayList<game_level> gameLevel = new ArrayList<>();
        gameLevel.add(arena.arenas);
        gameLevel.add(boss_level.bossLevels);
        gameLevel.add(shop.shops);
        gameLevel.add(normal_levels);
    }

    public static game_level getGameLevel(game_level gameLevel) {
        return gameLevel;
    }
}
