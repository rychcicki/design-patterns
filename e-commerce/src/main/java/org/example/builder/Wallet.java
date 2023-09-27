package org.example.builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

@Builder
@ToString
public class Wallet {
    private String name;
    @Singular("oneCurrency")
    private final Set<String> listOfCurrencies;

    public static void main(String[] args) {
        System.out.println(Wallet.builder()
                .name("firstWallet")
                .oneCurrency("dollar")
                .oneCurrency("cebulion")
                .oneCurrency("ojro")
                .oneCurrency("cebulion")
                .build());
    }
}
