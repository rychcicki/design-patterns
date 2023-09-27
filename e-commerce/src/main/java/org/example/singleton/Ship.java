package org.example.singleton;

public enum Ship {
    /**
     * prywatny konstruktor
     * pole zawierające jego jedyną instancję
     * statyczna metoda fabryczna uzyskiwania instancji
     */
    RORO("Figaro");

    Ship(String info) {
    } //private is redundant

    public Ship getInstance() {
        return RORO;
    }

    public static void main(String[] args) {
        System.out.println(Ship.RORO.getInstance());
    }
}
