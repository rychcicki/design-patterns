package org.example;

import java.math.BigDecimal;

public class Payment {
    void payWithOneMethod(Payable payable, BigDecimal amount) {
        payable.pay(amount);
    }
}
