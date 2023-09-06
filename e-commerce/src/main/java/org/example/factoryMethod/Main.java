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

/**
 * Bez posiłkowania się koncepcją wzorców projektowych, a zwłaszcza omawianego dzisiaj napisz implementacje problemu :
 * Załóżmy ze masz system e-commerce, który obsługuje różne metody płatności takie jak :
 * - karta kredytowa
 * - bitcoin
 * - paypal
 * - przelew bankowy
 * <p>
 * Każda z tych metod musi w jakiś sposób procesowac płatność.
 * Na potrzeby zadania może to być prosta metoda void która wyświetli zależnie od metody płatności tekst :
 * Przykład dla PayPal
 * Payment processing with PayPal. Charging X$ from your account
 * Podobny tekst ma się wyświetlić dla całej reszty.
 * I od razu mówię ze to po prostu uproszczony przykład bo wyobraź sobie ze tam ma się magia dziać i musisz sprawdzać czy ktoś zalogowany do paypala potem czy ma kasę na koncie potem gdzie wysyła jak wysyła itd
 * I to samo np z karta czy karta poprawna czy cvv poprawne czy data wygaśnięcia poprawna czy cardholder poprawny etc.
 * Uproszczam to po to abyś nie implementowal tego przez tydzień.
 * Masz 2h żeby to zrobić maksymalnie.
 * Więc zajdź sobie wolne 2h i zaimplementuj to.
 * Pamiętaj o zasadach czystego kodu o abstrakcjach enkapsulacjach i innych bajerach.
 * Zrób repo sobie design-patterns na gicie i dodaj mnie do niego i zrób PR. Ja przeprowadzę Code review.
 */