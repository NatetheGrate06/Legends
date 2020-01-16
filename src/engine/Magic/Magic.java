package engine.Magic;

import engine.Characters.enemy_characters.enemy;
import engine.Characters.playable_characters.Knights.knight;
import engine.Player.magic_level;
import engine.Player.player;
import engine.Player.player_level;
import engine.Stats.player_stats.player_magic;

import java.util.ArrayList;
import java.util.List;

import static engine.Characters.enemy_characters.enemy.enemyState.*;
import static engine.Player.magic_level.*;
import static engine.Player.player.canPlayerUse;
import static engine.Player.player.playerState.normalPlayerState;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;

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



    protected void getMagic() {
    }

    protected static class primary_magic {

        protected primary_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                                boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile,
                                boolean doesSummonEntity, boolean isBoosting) {

        }

        public primary_magic primaryMagic;
        public boolean isUsingPrimaryMagic; {
            if(isUsingPrimaryMagic = true) {
                manaDepletion = Math.round(manaDepletion * 1.5);
                player.damagePerHit = (int) Math.round(1.5 * player_level.playerLevelBoost + magicLevel);
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) normalPlayerState;
            }
        }
    }

    protected static class secondary_magic {

        protected secondary_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                                 boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {

        }

        public static secondary_magic secondaryMagic;
        public static boolean isUsingSecondaryMagic;{
            if (isUsingSecondaryMagic = true) {
                manaDepletion = Math.round(manaDepletion * 1.5);
                player.damagePerHit = 1 * player_level.playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) normalPlayerState;
            }
        }

        public static secondary_magic secondaryMagicLevelRequirement; {
            if(player_magic.magicLevel == magicLevel4) {
                canPlayerUse = true;
            } else {
                System.out.println(player.notUnlockedError);
            }
        }
    }

    protected static class jump_magic {

        protected jump_magic(jump_magic jumpMagic) {
            this.jumpMagic = jumpMagic;
        }

        public static jump_magic jumpMagic;
        public boolean isUsingJumpMagic; {
            if (isUsingJumpMagic = true) {
                manaDepletion = Math.round(manaDepletion * 1.5);
                player.damagePerHit = (int) Math.round(0.5 * player_level.playerLevelBoost + magicLevel);
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) normalPlayerState;
            }
        }

        public jump_magic jumpMagicLevelRequirement; {
            if (player_magic.magicLevel == magicLevel20) {
                canPlayerUse = true;
            } else {
                System.out.println(player.notUnlockedError);
            }
        }
    }

    protected static class secondary_jump_magic {

        protected secondary_jump_magic(secondary_jump_magic secondaryJumpMagic) {
            this.secondaryJumpMagic = secondaryJumpMagic;
        }

        protected secondary_jump_magic secondaryJumpMagic;
        protected boolean isUsingSecondaryJumpMagic; {
            if (isUsingSecondaryJumpMagic = true) {
                manaDepletion = Math.round(manaDepletion * 1.5);
                player.damagePerHit = 1 * player_level.playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) normalPlayerState;
            }
        }

        public secondary_jump_magic secondaryJumpMagicLevelRequirement; {
            if (player_magic.magicLevel == magicLevel8) {
                canPlayerUse = true;
            } else {
                System.out.println(player.notUnlockedError);
            }
        }
    }

}
