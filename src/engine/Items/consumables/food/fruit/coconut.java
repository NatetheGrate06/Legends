package engine.Items.consumables.food.fruit;

import engine.Stats.player_stats.player_defense;

import static engine.Player.player_level.playerLevelUp;

public class coconut {

    public boolean coconut;
    public int coconutHealth = (int) (20 * (1.2 / playerLevelUp));

    public boolean isCoconut(boolean b) {
        return coconut;
    }

    protected int main(String[] args) {
        if (isCoconut(true)) {
            return player_defense.givePlayerHealth();
        }
        return coconutHealth;
    }
}
