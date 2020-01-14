package engine.Magic;

public class blacksmith_magic extends Magic {

    protected blacksmith_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile) {
        super(blacksmithMagic, false, false, false, false, false, false, true);
    }

    public static blacksmith_magic blacksmithMagic;
}
