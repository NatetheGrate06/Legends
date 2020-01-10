package engine.Currency.Hexagonal_Gems;

import engine.Currency.currency;

public class hexagonal_diamond extends currency {

    @Override
    protected void getCurrencyValue(int currencyValue) {
        super.getCurrencyValue(16);
    }
}
