package engine.Magic;

public class ninja_magic extends Magic {

    //TODO ninja maximate summons a mini army of ninjas that attacks nearby enemies until the enemy is killed
    protected ninja_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(ninjaMagic, false, false, false, false, true, true, true, false);
    }

    public static ninja_magic ninjaMagic;
}
