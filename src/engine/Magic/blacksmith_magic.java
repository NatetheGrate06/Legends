package engine.Magic;

public class blacksmith_magic extends Magic {

    //TODO blacksmith maximate gives everyone's weapon an attack boost for up to 30 sec and he summons a giant toad but recharge costs more
    protected blacksmith_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile) {
        super(blacksmithMagic, false, false, false, false, false, false, true, true);
    }

    public static blacksmith_magic blacksmithMagic;
}
