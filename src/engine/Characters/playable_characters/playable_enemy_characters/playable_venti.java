package engine.Characters.playable_characters.playable_enemy_characters;

import Game_Levels.arenas.cloud_arena;
import engine.unlocking_variables;

public class playable_venti extends enemy_character {

    public static unlocking_variables unlockingPlayableVenti;

    playable_venti(unlocking_variables unlockingVariable) {
        super(cloud_arena.unlockingCloudArena);
    }
}
