package engine.Magic;

public class king_magic extends Magic {

    //TODO king maximate heals all nearby allies to full health and beheads nearby enemies
    protected king_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(kingMagic, false, false, false, false, true, true, false, true);
    }

    public static king_magic kingMagic;
}
