package org.example.factoryMethod;

import java.math.BigDecimal;

public class CreditCard implements Payable {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment processing with credit card. Charging " + amount + "$ from your account.");
    }
}
