package engine.Magic;

import engine.Characters.enemy_characters.enemy;
import engine.Characters.playable_characters.Knights.knight;
import engine.Player.player;

import java.util.ArrayList;
import java.util.List;

import static engine.Characters.enemy_characters.enemy.enemyState.*;
import static engine.Player.player.playerState.normalPlayerState;

//TODO create secondary magic
public class Magic {

    protected Magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                    boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile,
                    boolean doesSummonEntity, boolean isBoosting) {
        this.getMagic();
        this.isParalyzingMagic();
        this.isLingeringMagic();
        this.isLeechingMagic();
        this.isEnemyManipulationMagic();
        this.isPlayerStateAltering();
        this.doesShootProjectile();
        this.doesSummonEntity();
    }

    public boolean doesSummonEntity() {
        return doesSummonEntity();
    }

    public boolean doesShootProjectile() {
        return doesShootProjectile();
    }

    protected boolean isPlayerStateAltering() {
        if(isPlayerStateAltering()) {
            //make this a list of what it equals
            player.playerCharacterState.playerCharacterState.isNormalPlayerState = false;
        }
        return isPlayerStateAltering();
    }

    protected boolean isEnemyManipulationMagic() {
        if(isEnemyManipulationMagic()) {
            enemyState = enemyMagicGrabbed;
        }
        return isEnemyManipulationMagic();
    }

    protected boolean isLeechingMagic() {
        if (isLeechingMagic()) {
            enemyState = enemyBeingLeeched;
        }
        return isLeechingMagic();
    }

    protected boolean isLingeringMagic() {
        if(isLingeringMagic()) {
            enemyState = lingeringDamage;
        }
        return isLingeringMagic();
    }

    protected boolean isParalyzingMagic() {
        if (isParalyzingMagic()) {
            enemy.enemyState.enemyState = stunned;
        }
        return isParalyzingMagic();
    }

    public static Magic magic;
    public static Magic knightMagic;

    public Magic getKnightMagic() {
        return knightMagic;
    }

    private Magic main(String[] args) {
        if(knight.isKnight(true)) {
            return knightMagic;
        }
        return magic;
    }

    protected void getMagic() {
    }

    protected static class primary_magic {

        protected primary_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                                boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {

        }

        public primary_magic primaryMagic;
        public boolean isUsingPrimaryMagic; {

        }
    }

    protected static class secondary_magic {

        protected secondary_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                                 boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {

        }

        public static secondary_magic secondaryMagic;
        public static boolean isUsingSecondaryMagic;
    }

}
