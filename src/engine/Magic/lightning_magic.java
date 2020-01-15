package engine.Magic;

//TODO lightning maximate strikes down all nearby enemies with thunder
public class lightning_magic extends Magic {

    protected lightning_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
        super(lightningMagic, true, false, false, true, false, true, false, false);
    }

    public static lightning_magic lightningMagic;
}
