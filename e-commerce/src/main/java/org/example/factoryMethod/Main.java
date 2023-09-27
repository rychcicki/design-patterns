package org.example.factoryMethod;

import lombok.extern.java.Log;

import java.math.BigDecimal;

@Log
public class Main {
    public static void main(String[] args) {
        log.info("Hello world!");

        Payment payment = new Payment();
        payment.payWithOneMethod(new Bitcoin(), new BigDecimal("12.54"));
        payment.payWithOneMethod(new BankTransfer(), new BigDecimal("12.54"));
        payment.payWithOneMethod(new CreditCard(), new BigDecimal("12.54"));
        payment.payWithOneMethod(new PayPal(), new BigDecimal("12.54"));
    }
}
