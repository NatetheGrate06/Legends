package engine.Magic;

import engine.Maximates.maximate;
import engine.Player.player;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.player_stats.player_magic.magicLevelBoost;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;

//TODO battleaxe maximate summons a giant guillotine and it decapitates all of the enemies
public class battleaxe_magic extends Magic {

    protected battleaxe_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
        super(battleaxeMagic, false, false, false, false, false, true, true, false);
    }
    public static battleaxe_magic battleaxeMagic;

    protected static class primary_battleaxe_magic extends primary_magic {

        protected primary_battleaxe_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
            super(primaryBattleaxeMagic, false, false, false, false, false, true, false, false);
        }

        public static primary_battleaxe_magic primaryBattleaxeMagic;{
            if (isUsingPrimaryMagic = true) {
                manaDepletion = manaDepletion * 1 / playerLevelBoost + magicLevel;
                player.damagePerHit = 3 * playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) player.playerState.playerInSpinningMagicAttack;
            }
        }
    }

    protected static class secondary_battleaxe_magic extends secondary_magic {

        protected secondary_battleaxe_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(secondaryBattleaxeMagic, false, false, false, false, false, true, false, false);
        }

        public static secondary_battleaxe_magic secondaryBattleaxeMagic;
    }

    protected static class battleaxe_jump_magic extends jump_magic {

        protected battleaxe_jump_magic(jump_magic jumpMagic) {
            super(battleaxeJumpMagic);
        }

        public static battleaxe_jump_magic battleaxeJumpMagic;
    }

    protected static class battleaxe_secondary_jump_magic extends secondary_jump_magic {

        protected battleaxe_secondary_jump_magic(secondary_jump_magic secondaryJumpMagic) {
            super(battleaxeSecondaryJumpMagic);
        }

        public static battleaxe_secondary_jump_magic battleaxeSecondaryJumpMagic;
    }

    protected static class battleaxe_maximate extends maximate {

        protected battleaxe_maximate(engine.Maximates.maximate maximate, int getRecharge, int getRadius) {
            //needs 25 kills to recharge and has a 5 enemy kill radius
            super(battleaxeMaximate, 25 / magicLevelBoost, 5);
        }

        public static battleaxe_maximate battleaxeMaximate;
    }
}
