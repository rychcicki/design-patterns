package org.example.builder;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long pesel;
    private LocalDate dateOfBirth;

    // 1. Tworzysz bez modyfikatora konstruktor z wszystkimi parametrami
    Person(String firstName, String lastName, int age, long pesel, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
    }

    // 2. Tworzysz metodę statyczną builder(), która zwraca ObjBuilder,
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    // 3. Tworzysz klasę statyczną ObjBuilder ze wszystkimi polami typu private danej klasy.
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private long pesel;
        private LocalDate dateOfBirth;

        //  4. W tej klasie robisz konstruktor bezparametrowy i metody ustawiające dane pola (podobne do setter),
        //      ale zwracające obiekty typu ObjBuilder (return this;).
        PersonBuilder() {
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder pesel(long pesel) {
            this.pesel = pesel;
            return this;
        }

        public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        // 5. Robisz metodę typu danej klasy build(), która zwraca nowy obiekt tej klasy ze wszystkimi parametrami tej klasy, jako this.pole.
        public Person build() {
            return new Person(this.firstName, this.lastName, this.age, this.pesel, this.dateOfBirth);
        }

        // 6. Nadpisujesz metodę toString(), ale dorabiasz this z nazwą pola, this.pole, ale to dla klasy statycznej - do głównej i tak musi być toString()
        @Override
        public String toString() {
            return "ObjBuilder{" +
                    "firstName='" + this.firstName + '\'' +
                    ", lastName='" + this.lastName + '\'' +
                    ", age=" + this.age +
                    ", pesel=" + this.pesel +
                    ", dateOfBirth=" + this.dateOfBirth +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(Person.builder()
                .age(67)
                .firstName("Andrzej")
                .lastName("Nowak")
                .dateOfBirth(LocalDate.of(1957, 01, 29))
                .build());
    }
}
