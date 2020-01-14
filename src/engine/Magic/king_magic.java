package engine.Magic;

public class king_magic extends Magic {

    protected king_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(kingMagic, false, false, false, false, true, true, false);
    }

    public static king_magic kingMagic;
}
