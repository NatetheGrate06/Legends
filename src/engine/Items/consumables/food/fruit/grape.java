package engine.Items.consumables.food.fruit;

import engine.Stats.player_stats.player_defense;

import static engine.Player.player_level.playerLevelUp;

public class grape {

    public boolean grape;
    public int grapeHealth = (int) (30 * (1.2 / playerLevelUp));

    public boolean isGrape(boolean b) {
        return grape;
    }

    protected int main(String[] args) {
        if (isGrape(true)) {
            return player_defense.givePlayerHealth();
        }
        return grapeHealth;
    }
}
