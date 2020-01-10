package engine.Items.consumables.food.fruit;

import engine.Stats.player_stats.player_defense;

import static engine.Player.player_level.playerLevelUp;

public class apple {

    public boolean apple;
    public int appleHealth = (int) (22 * (1.2 / playerLevelUp));

    public boolean isApple(boolean b) {
        return apple;
    }

    protected int main(String[] args) {
        if (isApple(true)) {
            return player_defense.givePlayerHealth();
        }
        return appleHealth;
    }
}
