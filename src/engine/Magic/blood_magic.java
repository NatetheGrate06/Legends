package engine.Magic;

public class blood_magic extends Magic {

    //TODO blood maximate gives nearby allies a leech effect to their attacks and you go into vampire mode
    protected blood_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(bloodMagic, false, false, true, false, false, true, false, true);
    }

    public static blood_magic bloodMagic;
}
