package engine.Magic;

//TODO nurse maximate summons a pet stampede
public class nurse_magic extends Magic {
    protected nurse_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(magic, isParalyzing, isLingering, isLeeching, isEnemyManipulating, isPlayerStateAltering, doesShootProjectile, doesSummonEntity, false);
    }
}
