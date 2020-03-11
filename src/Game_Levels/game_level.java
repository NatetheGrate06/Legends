package Game_Levels;

import Game_Levels.arenas.*;
import Game_Levels.boss_levels.cyclops_boss_level;
import engine.Bosses.boss;
import engine.Characters.enemy_characters.enemy;
import engine.ShopsAndItemValues.Shops.shop;

import java.util.ArrayList;

public class game_level {

    //TODO get enemies and get num enemies doesn't automatically implement when the constructor is made
    protected game_level(final game_level levelType, boolean hasBoss, boolean levelContainsPets,
                         boolean levelContainsWeapons, boolean hasItem, boolean hasBeefyEnemies, boolean hasWaves) {
        getNumOfEnemies(numOfEnemies);
        getLevelEnemies(enemy.enemy);
        this.hasWaves = hasWaves;
        this.hasKeyItems = hasItem;
        this.hasBeefyEnemies = hasBeefyEnemies; {
            if (hasBeefyEnemies = true) {
                getBeefyEnemies(enemy.beefy_enemy.beefyEnemy);
            }
        }
        this.levelType = levelType; {
            if (this.levelType == shop.shops) {
                numOfEnemies = 0;
            }
        }
        this.hasBoss = hasBoss; {
            if (hasBoss = true) {
                boss.getBoss(boss.boss);
            }
        }
        this.levelContainsPets = levelContainsPets;
        this.levelContainsWeapons = levelContainsWeapons;
    }
    public static game_level gameLevel;
    public static boolean hasBoss; {
        if (hasBoss = true) {
            boss.getBoss(boss.boss);
        }
    }
    public static int numOfEnemies;
    public static boolean levelContainsPets;
    public static boolean levelContainsWeapons;
    public static boolean hasKeyItems;
    public final boolean hasWaves;
    public static boolean hasBeefyEnemies; {
        if (hasBeefyEnemies = true) {
            getBeefyEnemies(enemy.beefy_enemy.beefyEnemy);
        }
    }

    private enemy.beefy_enemy getBeefyEnemies(enemy.beefy_enemy beefyEnemy) {
        return beefyEnemy;
    }

    //TODO finish this array list
    public static game_level normal_levels; {
        ArrayList<game_level> normal_levels = new ArrayList<>();

    }

    public static game_level levelType; {
        ArrayList<game_level> gameLevel = new ArrayList<>();
        gameLevel.add(boss_level.bossLevels);
        gameLevel.add(arena.arenas);
        gameLevel.add(shop.shops);
        gameLevel.add(normal_levels);
    }

    public final int getNumOfEnemies(int i) {
        return getNumOfEnemies(0);
    }

    public static game_level getGameLevel(game_level gameLevel) {
        return gameLevel;
    }

    public static enemy getLevelEnemies(enemy enemy) {
        return enemy;
    }

    public static class boss_level {

        //TODO finish this array list
        public static game_level bossLevels; {
            ArrayList<game_level.boss_level> bossLevels = new ArrayList<>();
            bossLevels.add(cyclops_boss_level.cyclopsBossLevel);
        }
    }

    public static class arena {

        public static game_level arenas; {
            ArrayList<arena> arenas = new ArrayList<>();
            arenas.add(barbarian_arena.barbarianArena);
            arenas.add(cloud_arena.cloudArena);
            arenas.add(thief_arena.thiefArena);
            arenas.add(corrupted_arena.corruptedArena);
            arenas.add(marsh_arena.marshArena);
            arenas.add(lava_arena.lavaArena);
            arenas.add(desert_arena.desertArena);
        }
    }
}
