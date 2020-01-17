package engine.Magic;

import engine.Player.player;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.player_stats.player_magic.magicLevelBoost;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;

public class blood_magic extends Magic {

    //TODO blood maximate gives nearby allies a leech effect to their attacks and you go into vampire mode
    protected blood_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(bloodMagic, false, false, true, false, false, true, false, true);
    }

    public static blood_magic bloodMagic;

    protected static class primary_blood_magic extends primary_magic {

        protected primary_blood_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(primaryBloodMagic, true, false, true, false, true, true, false, true);
        }

        public static primary_blood_magic primaryBloodMagic; {
            if (isUsingPrimaryMagic = true) {
                manaDepletion = manaDepletion * 2 / playerLevelBoost + magicLevel;
                player.damagePerHit = 3 * playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) player.playerState.playerInSpinningMagicAttack;
                player.healPlayerFromLeech = player.healPlayerFromLeech;
            }
        }
    }

    protected static class secondary_blood_magic extends secondary_magic {

        protected secondary_blood_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
            super(secondaryBloodMagic, false, false, true, false, false, true, false, true);
        }

        public static secondary_blood_magic secondaryBloodMagic;
    }

    protected static class blood_jump_magic extends jump_magic {

        protected blood_jump_magic(jump_magic jumpMagic) {
            super(bloodJumpMagic);
        }

        public static blood_jump_magic bloodJumpMagic;
    }

    protected static class blood_secondary_jump_magic extends secondary_jump_magic {

        protected blood_secondary_jump_magic(secondary_jump_magic secondaryJumpMagic) {
            super(bloodSecondaryJumpMagic);
        }

        public static blood_secondary_jump_magic bloodSecondaryJumpMagic;
    }

    protected static class blood_maximate extends maximate {

        protected blood_maximate(engine.Magic.maximate maximate, int getRecharge, int getRadius) {
            //needs 25 kills to recharge and has a 5 enemy kill radius
            super(bloodMaximate, 30 / magicLevelBoost, null);
        }

        public static blood_maximate bloodMaximate;
    }
}
