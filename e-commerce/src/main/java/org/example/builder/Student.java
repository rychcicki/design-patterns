package org.example.builder;

import lombok.ToString;

@ToString
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int year;

    public Student(String firstName, String lastName, int age, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
    }

    //    @Builder
    // Nad metodą tworzy konstruktor zawierający tylko te pola
    public static Student createStudent(String firstName, String lastName, int year) {
        return new Student(firstName, lastName, -1, year);
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int year;

        public StudentBuilder() {
        }

        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder year(int year) {
            this.year = year;
            return this;
        }

        public Student build() {
            return Student.createStudent(this.firstName, this.lastName, this.year);
        }
        
        @Override
        public String toString() {
            return "StudentBuilder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(
                builder()
                        .lastName("Nowak")
                        .year(22)
                        .build());
    }
}
