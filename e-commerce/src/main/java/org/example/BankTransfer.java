package org.example;

import java.math.BigDecimal;

public class BankTransfer implements Payable {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment processing with your Bank. Charging " + amount + "$ from your account.");
    }
}
