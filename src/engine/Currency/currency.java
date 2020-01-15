package engine.Currency;

import static engine.Player.Player_Moves.player_action.isPickedUp;

public class currency {

    protected int currencyValue;

    protected void getCurrencyValue(int currencyValue) {
        this.currencyValue = currencyValue;
    }

    protected void printCurrencyValue() {
        if (isPickedUp = true) {
            System.out.println("+" + currencyValue);
        }
    }
}
