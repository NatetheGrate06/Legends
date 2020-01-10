package engine.Items.consumables.food.fruit;

import engine.Stats.player_stats.player_defense;

import static engine.Player.player_level.playerLevelUp;

public class golden_banana {

    public boolean goldenBanana;
    public int goldenBananaHealth = (int) (50 * (1.2 / playerLevelUp));

    public boolean isGoldenBanana(boolean b) {
        return goldenBanana;
    }

    protected int main(String[] args) {
        if (isGoldenBanana(true)) {
            return player_defense.givePlayerHealth();
        }
        return goldenBananaHealth;
    }
}
