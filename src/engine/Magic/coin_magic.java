package engine.Magic;

//TODO coin maximate turns nearby enemies into coin crates
public class coin_magic extends Magic {

    protected coin_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
        super(coinMagic);
    }

    public static coin_magic coinMagic;
}
