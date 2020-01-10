package engine.Items.consumables.food.fruit;

import engine.Stats.player_stats.player_defense;

import static engine.Player.player_level.playerLevelUp;

public class watermelon {

    public boolean watermelon;
    public int watermelonHealth = (int) (28 * (1.2 / playerLevelUp));

    public boolean isWatermelon(boolean b) {
        return this.watermelon;
    }
    protected int main(String[] args) {
        if (isWatermelon(true)) {
            return player_defense.givePlayerHealth();
        }
        return watermelonHealth;
    }


}
