package engine.Magic;


import engine.Player.player_level;
import engine.Stats.player_stats.player_magic;

public class poison_magic extends Magic {

    protected poison_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(poisonMagic, false, true, false, false, false, true, false, false);
    }

    public static poison_magic poisonMagic;
    public int initialPoisonDamage = 2 * player_magic.magicLevelBoost;
    public int lingeringPoisonDamage = 4 * player_magic.magicLevelBoost;
}
