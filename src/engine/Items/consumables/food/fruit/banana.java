package engine.Items.consumables.food.fruit;

import engine.Stats.player_stats.player_defense;

import static engine.Player.player_level.playerLevelUp;

public class banana {

    public boolean banana;
    public int bananaHealth = (int) (26 * (1.2 / playerLevelUp));

    public boolean isBanana(boolean b) {
        return banana;
    }

    protected int main(String[] args) {
        if (isBanana(true)) {
            return player_defense.givePlayerHealth();
        }
        return bananaHealth;
    }
}
