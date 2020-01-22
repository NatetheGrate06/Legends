package engine.Characters.playable_characters.playable_enemy_characters;

import engine.Characters.playable_characters.playable_NPCs.playable_peasant;
import engine.unlocking_variables;

public class playable_zombie extends enemy_character {
    playable_zombie(unlocking_variables unlockingVariable) {
        super(playable_peasant.unlockingPlayablePeasant);
    }
}
