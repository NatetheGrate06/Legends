package engine.Stats.stat_bars;

import java.awt.*;
import java.util.function.Function;

import static engine.Player.player.isPlayerInLevel;

public class player_health_bar extends bar {

    public static double healthCharge = charge.chargeSpeed()[4];
    public static double healthDepletion = charge.depletionSpeed()[4];
    protected Object healthBar = new Dimension(50, 10);

    public Function showStaminaBar() {
        if (isPlayerInLevel(true)) {
            return (Function) healthBar;
        }
        return showBar();
    }
}
