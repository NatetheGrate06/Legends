package engine.Characters.playable_characters.playable_enemy_characters;

import engine.Characters.playable_characters.Knights.red_knight;
import engine.unlocking_variables;

public class playable_skeleton extends enemy_character {

    playable_skeleton(unlocking_variables unlockingVariable) {
        super(red_knight.unlockingRedKnight);
    }
    public static unlocking_variables unlockingPlayableSkeleton;

}
