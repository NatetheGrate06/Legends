package engine.Magic;

public class dark_magic extends Magic {

    protected dark_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(darkMagic, false, true, false, false, false, true, false);
    }

    public static dark_magic darkMagic;
}
