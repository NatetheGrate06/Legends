package engine.Characters.playable_characters.playable_enemy_characters;

import Game_Levels.arenas.thief_arena;
import engine.unlocking_variables;

public class playable_thief extends enemy_character {

    playable_thief(unlocking_variables unlockingVariable) {
        super(thief_arena.unlockingThiefArena);
    }
}
