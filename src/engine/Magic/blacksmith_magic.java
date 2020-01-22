package engine.Magic;

import engine.Maximates.maximate;
import engine.Player.player;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.player_stats.player_magic.magicLevelBoost;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;

public class blacksmith_magic extends Magic {

    //TODO blacksmith maximate gives everyone's weapon an attack boost for up to 30 sec and he summons a giant toad but recharge costs more
    protected blacksmith_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile) {
        super(blacksmithMagic, false, true, false, false, false, true, true, true);
    }

    public static blacksmith_magic blacksmithMagic;

    protected static class primary_blacksmith_magic extends primary_magic {

        protected primary_blacksmith_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(primaryBlacksmithMagic, false, true, false, false, true, false, true, false);
        }

        public static primary_blacksmith_magic primaryBlacksmithMagic; {
            if (isUsingPrimaryMagic = true) {
                manaDepletion = Math.round(manaDepletion * 1.5 / playerLevelBoost + magicLevel);
                player.damagePerHit = 3 * playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) player.playerState.playerInSpinningMagicAttack;
            }
        }
    }

    protected static class secondary_blacksmith_magic extends secondary_magic {

        protected secondary_blacksmith_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(secondaryBlacksmithMagic, false, true, false, false, false, true, false, false);
        }

        public static secondary_blacksmith_magic secondaryBlacksmithMagic;
    }

    protected static class blacksmith_jump_magic extends jump_magic {

        protected blacksmith_jump_magic(jump_magic jumpMagic) {
            super(blacksmithJumpMagic);
        }

        public static blacksmith_jump_magic blacksmithJumpMagic;
    }

    protected static class blacksmith_secondary_jump_magic extends secondary_jump_magic {

        protected blacksmith_secondary_jump_magic(secondary_jump_magic secondaryJumpMagic) {
            super(blacksmithSecondaryJumpMagic);
        }

        public static blacksmith_secondary_jump_magic blacksmithSecondaryJumpMagic;
    }

    protected static class blacksmith_maximate extends maximate {

        protected blacksmith_maximate(engine.Maximates.maximate maximate, int getRecharge, int getRadius) {
            //needs 25 kills to recharge and has a 5 enemy kill radius
            super(blacksmithMaximate, 33 / magicLevelBoost, 6);
        }

        public static blacksmith_maximate blacksmithMaximate;
    }
}
