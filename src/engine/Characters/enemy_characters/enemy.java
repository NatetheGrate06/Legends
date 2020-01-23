package engine.Characters.enemy_characters;

import Game_Levels.game_level;
import engine.Characters2.pets.pet;
import engine.Items.weapons.weapon;
import engine.Magic.Magic;

import java.util.ArrayList;

public class enemy {

    //TODO put the constructor in the child classes
    protected enemy(game_level getGameLevel, enemy getEnemy, weapon getEnemyWeapon, Magic getMagic,
                    pet getPet, Boolean isBeefy, Boolean hasPet) {}

    public boolean isEnemyAttacking;
    public enemy enemy;

    public enemy isEnemy() {
        return this;
    }

    public static class enemyState {


        public static enemyState currentEnemyState;

        //TODO polish this out and add to enemy state
        //This applies to song magic and lightning magic
        public static enemyState stunned; {
            if (currentEnemyState == stunned) {
                canEnemyMove(false);
            }
        }

        public static enemyState lingeringDamage;
        public static enemyState enemyOnFire;
        public static enemyState enemyPoisoned;
        public static enemyState enemyFrozen;
        public static enemyState enemyInWarp;
        public static enemyState enemyInSwordLock;
        //This applies to psychic magic
        public static enemyState enemyMagicGrabbed;
        public static enemyState enemyBeingLeeched;

        public static enemyState enemyState; {
            ArrayList<enemyState> enemyState = new ArrayList<>();
            enemyState.add(stunned);
            enemyState.add(lingeringDamage);
            enemyState.add(enemyOnFire);
            enemyState.add(enemyPoisoned);
            enemyState.add(enemyFrozen);
            enemyState.add(enemyInWarp);
            enemyState.add(enemyInSwordLock);
            enemyState.add(enemyMagicGrabbed);
            enemyState.add(enemyBeingLeeched);
        }

        public static boolean canEnemyMove(boolean b) {
            return canEnemyMove(b);
        }


    }
}
