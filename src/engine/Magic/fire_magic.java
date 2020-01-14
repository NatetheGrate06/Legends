package engine.Magic;

public class fire_magic extends Magic {

    protected fire_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(fireMagic, false, true, false, false, false, true, false);
    }

    public static fire_magic fireMagic;
}
