package org.example.factoryMethod;

import java.math.BigDecimal;

public class Bitcoin implements Payable {

    @Override
    public void pay(BigDecimal amount) {
        BigDecimal amountOfBtc = amount.multiply(USD_TO_BTC);
        System.out.println("Payment processing with Bitcoin. Charging " + amountOfBtc + " BTC from your account.");
    }
}
