package engine.Magic;

public class barbaric_magic extends Magic {

    protected barbaric_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                             boolean isEnemyManipulating, boolean isPlayerStateAltering) {
        super(barbaric_magic.barbaricMagic, false, false, false, false, false, true, false, false);
    }

    public static barbaric_magic barbaricMagic;
}
