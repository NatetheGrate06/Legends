package Game_Levels.arenas;

import Game_Levels.game_level;

import java.util.ArrayList;

public class arena extends game_level {

    public static arena arenas; {
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
