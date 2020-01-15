package engine.Magic;

//TODO psychic maximate melts enemies' brains
public class psychic_magic extends Magic {

    protected psychic_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(psychicMagic, false, false, false, true, true, true, false, false);
    }

    public static psychic_magic psychicMagic;
}
