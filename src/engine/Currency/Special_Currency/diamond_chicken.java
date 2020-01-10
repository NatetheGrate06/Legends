package engine.Currency.Special_Currency;

import engine.Currency.currency;

public class diamond_chicken extends currency {

    @Override
    protected void getCurrencyValue(int currencyValue) {
        super.getCurrencyValue(1000);
    }
}
