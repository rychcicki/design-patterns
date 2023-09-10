package org.example.builder;

import lombok.ToString;

import java.time.LocalDate;

@ToString
public class CreditCard {
    private int numberOfCard;
    private Person owner;
    private LocalDate validDate;

    //    @Builder
// Nad konstruktorem tworzy konstruktor zawierający tylko te pola
    public CreditCard(int numberOfCard, LocalDate validDate) {
        this.numberOfCard = numberOfCard;
        this.validDate = validDate;
    }

    public static CreditCardBuilder builder() {
        return new CreditCardBuilder();
    }

    public static class CreditCardBuilder {
        private int numberOfCard;
        private LocalDate validDate;

        public CreditCardBuilder() {
        }

        public CreditCardBuilder numberOfCard(int numberOfCard) {
            this.numberOfCard = numberOfCard;
            return this;
        }

        public CreditCardBuilder validDate(LocalDate validDate) {
            this.validDate = validDate;
            return this;
        }

        public CreditCard build() {
            return new CreditCard(this.numberOfCard, this.validDate);
        }
    }

    public static void main(String[] args) {
        System.out.println(
                CreditCard.builder()
                        .numberOfCard(12542)
                        .build());
    }
}
