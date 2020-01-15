package engine.Magic;

public class black_magic extends Magic {

    //takes over the enemy and corrupts them for up to 8 seconds
    protected black_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                          boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile) {
        super(blackMagic, false, false, false, true, false, false, false, false);
    }

    public static black_magic blackMagic;
}
