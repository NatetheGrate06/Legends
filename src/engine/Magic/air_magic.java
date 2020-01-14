package engine.Magic;

public class air_magic extends Magic {

    protected air_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching,
                        boolean isEnemyManipulating, boolean isPlayerStateAltering) {
        super(air_magic.airMagic, false, false, false, false,
                true, false, false);
    }

    public static air_magic airMagic;
}
