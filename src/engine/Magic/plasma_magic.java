package engine.Magic;

public class plasma_magic extends Magic {

    //TODO plasma maximate liquidizes nearby enemies
    protected plasma_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(plasmaMagic, true, false, false, false, false, true, false, false);
    }

    public static plasma_magic plasmaMagic;
}
