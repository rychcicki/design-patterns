package org.example;

import java.math.BigDecimal;

public interface Payable {
    BigDecimal USD_TO_BTC = new BigDecimal("0.0000384");

    void pay(BigDecimal amount);
}
