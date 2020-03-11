package engine.Characters.playable_characters.playable_enemy_characters;

import engine.Characters.character;
import engine.unlocking_variables;

import javax.swing.*;

public class enemy_character extends engine.Characters.character {

    enemy_character(unlocking_variables unlockingVariable, ImageIcon characterSelect) {
        unlocking_variables.unlockingVariable = unlockingVariable;
        character.characterSelectIcon = characterSelect;
    }
}
