package engine.Characters.playable_characters.playable_enemy_characters;

import Game_Levels.arenas.barbarian_arena;
import engine.unlocking_variables;

public class playable_barbarian extends enemy_character {

    playable_barbarian(Void unlockingCharacter) {
        super(barbarian_arena.unlockingBarbarianArena);
    }

    public static unlocking_variables unlockingBarbarian;
}
