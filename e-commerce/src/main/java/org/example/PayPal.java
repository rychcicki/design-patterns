package org.example;

import java.math.BigDecimal;

public class PayPal implements Payable<PayPal>{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment processing with PayPal. Charging " + amount + "$ from your account.");
    }
}
