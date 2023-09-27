package org.example.singleton;

public enum Car {
    /**
     * prywatny konstruktor
     * pole zawierające jego jedyną instancję
     * statyczna metoda fabryczna uzyskiwania instancji
     */
    KIA;

    Car() {  // private is redundant
    }

    public Car getInstance() {
        return KIA;
    }

    public static void main(String[] args) {
        System.out.println(Car.KIA.getInstance());
    }
}
