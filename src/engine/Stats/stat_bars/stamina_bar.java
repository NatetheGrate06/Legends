package engine.Stats.stat_bars;

import java.awt.*;
import java.util.function.Function;

import static engine.Player.player.isPlayerInLevel;

public class stamina_bar extends bar {

    public static double staminaCharge = charge.chargeSpeed()[2];
    public static double staminaDepletion = charge.depletionSpeed()[2];
    protected Object staminaBar = new Dimension(10, 50);

    public static double getStaminaCharge() {
        return staminaCharge;
    }

    @Override
    public Function showBar(engine.Stats.stat_bars.bar bar) {
        return super.showBar((engine.Stats.stat_bars.bar) staminaBar);
    }
}