package engine.Magic;
import engine.Maximates.maximate;
import engine.Player.player;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.player_stats.player_magic.magicLevelBoost;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;


public class air_magic extends Magic {

    protected air_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                        boolean isEnemyManipulating, boolean isPlayerStateAltering) {
        super(air_magic.airMagic, false, false, false, false,
                true, true, false, false);
    }

    public static air_magic airMagic;

    protected static class primary_air_magic extends primary_magic {

        protected primary_air_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(primaryAirMagic, false, false, false, false, true, false, false, false);
        }

        public static primary_air_magic primaryAirMagic; {
            if (isUsingPrimaryMagic = true) {
                manaDepletion = manaDepletion * 2 / playerLevelBoost + magicLevel;
                player.damagePerHit = 3 * playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) player.playerState.playerInSpinningMagicAttack;
            }
        }
    }

    protected static class secondary_air_magic extends secondary_magic {

        protected secondary_air_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
            super(secondaryAirMagic, false, false, false, false, false, true, false, false);
        }

        public static secondary_air_magic secondaryAirMagic;
    }

    protected static class air_jump_magic extends jump_magic {

        protected air_jump_magic(jump_magic jumpMagic) {
            super(airJumpMagic);
        }

        public static air_jump_magic airJumpMagic;
    }

    protected static class air_secondary_jump_magic extends secondary_jump_magic {

        protected air_secondary_jump_magic(secondary_jump_magic secondaryJumpMagic) {
            super(airSecondaryJumpMagic);
        }

        public static air_secondary_jump_magic airSecondaryJumpMagic;
    }
    //TODO air maximate sweeps up nearby enemies, brings them up into the lower atmosphere, and drops them down
    protected static class air_maximate extends maximate {

        protected air_maximate(engine.Maximates.maximate maximate, int getRecharge, int getRadius) {
            //needs 25 kills to recharge and has a 5 enemy kill radius
            super(airMaximate, 25 / magicLevelBoost, 5);
        }

        public static air_maximate airMaximate;
    }
}