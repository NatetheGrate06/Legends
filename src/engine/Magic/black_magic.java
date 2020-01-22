package engine.Magic;

import engine.Maximates.maximate;
import engine.Player.player;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.player_stats.player_magic.magicLevelBoost;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;

public class black_magic extends Magic {

    //TODO takes over the enemy and corrupts them for up to 30 seconds
    protected black_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                          boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile) {
        super(blackMagic, false, true, false, true, false, false, false, false);
    }

    public static black_magic blackMagic;

    protected static class primary_black_magic extends primary_magic {

        protected primary_black_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(primaryBlackMagic, false, true, false, true, false, true, false, false);
        }

        public static primary_black_magic primaryBlackMagic; {
            if (isUsingPrimaryMagic = true) {
                manaDepletion = manaDepletion * 1 / playerLevelBoost + magicLevel;
                player.damagePerHit = 3 * playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) player.playerState.playerInSpinningMagicAttack;
            }
        }
    }

    protected static class secondary_black_magic extends secondary_magic {

        protected secondary_black_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(secondaryBlackMagic, false, true, false, false, false, true, false, false);
        }

        public static secondary_black_magic secondaryBlackMagic;
    }

    protected static class black_jump_magic extends jump_magic {

        protected black_jump_magic(jump_magic jumpMagic) {
            super(blackJumpMagic);
        }

        public static black_jump_magic blackJumpMagic;
    }

    protected static class black_secondary_jump_magic extends secondary_jump_magic {

        protected black_secondary_jump_magic(secondary_jump_magic secondaryJumpMagic) {
            super(blackSecondaryJumpMagic);
        }

        public static black_secondary_jump_magic blackSecondaryJumpMagic;
    }

    protected static class black_maximate extends maximate {

        protected black_maximate(engine.Maximates.maximate maximate, int getRecharge, int getRadius) {
            //needs kills to recharge and has an enemy kill radius
            super(blackMaximate, 20 / magicLevelBoost, 7);
        }

        public static black_maximate blackMaximate;
    }
}
