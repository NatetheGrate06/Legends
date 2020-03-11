package engine.Magic;

import engine.Player.player;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_magic.magicLevel;
import static engine.Stats.stat_bars.mana_bar.manaDepletion;

public class clone_magic extends Magic {

    //TODO clone maximate summons beefy clones for 10 sec
    protected clone_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(cloneMagic, false, false, false, false, true, false, true, false);
    }

    public static clone_magic cloneMagic;
    public static int clonesCreated;
    public static boolean isMaxClones;
    public static clone_magic clone;

    public static void createClone() {
        clonesCreated++;
    }

    protected static class primary_clone_magic extends primary_magic {

        protected primary_clone_magic(primary_magic primaryMagic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
            super(primaryMagic, isParalyzing, isLingering, isLeeching, isEnemyManipulating, isPlayerStateAltering, doesShootProjectile, doesSummonEntity, isBoosting);
        }

        protected static primary_clone_magic primaryCloneMagic; {
            if (isUsingPrimaryMagic = true ) {
                //TODO make mana depletion automatically divide level boost and magic level
                manaDepletion = Math.round((manaDepletion * 2 / clonesCreated) / playerLevelBoost + magicLevel);
                player.damagePerHit = 3 * playerLevelBoost + magicLevel;
                player.playerCharacterState.playerCharacterState = (player.playerCharacterState) player.playerState.playerInSpinningMagicAttack;
            }
            if (isMaxClones = true) {
                clonesCreated = 0;
            } else {
                createClone();
            }
        }
    }

    protected static class secondary_clone_magic extends secondary_magic {

        protected secondary_clone_magic(secondary_magic secondaryMagic, boolean isParalyzing, boolean isLingering,
                                        boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering,
                                        boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
            super(secondaryCloneMagic, false, false, false, false, false, true, true, false);
        }

        public static secondary_clone_magic secondaryCloneMagic;
    }
}

