package engine.Stats.stat_bars;

import engine.Player.player;

import java.awt.*;
import java.util.function.Function;

public abstract class bar {

    public static Object bar = new Dimension(50, 10);

    public Function showBar() {
        if (player.isPlayerInLevel(true)) {
            return (Function) bar;
        }
        return showBar();
    }
}