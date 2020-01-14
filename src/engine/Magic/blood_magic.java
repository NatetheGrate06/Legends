package engine.Magic;

public class blood_magic extends Magic {

    protected blood_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(bloodMagic, false, false, true, false, false, true, false);
    }

    public static blood_magic bloodMagic;
}
