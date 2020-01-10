package engine.Currency.Special_Currency;

import engine.Currency.currency;

public class golden_boot extends currency {

    @Override
    protected void getCurrencyValue(int currencyValue) {
        super.getCurrencyValue(500);
    }
}
