package org.example.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Life {
    /**
     * prywatny konstruktor
     * pole statyczne zawierające jego jedyną instancję
     * statyczna metoda fabryczna uzyskiwania instancji
     */
    private static Life onlyOneInstance;
    private String info = "Initial class info.";

    private Life() {
    }

    public /*synchronized*/ static Life getInstance() {
        if (onlyOneInstance == null) {
            onlyOneInstance = new Life();
        }
        return onlyOneInstance;
    }

    public static void main(String[] args) {
        Life life1 = Life.getInstance();
        System.out.println(life1.getInfo());
        Life life2 = Life.getInstance();
        life2.setInfo("bla, bla");
        System.out.println(life2.getInfo());
        Life life3 = Life.getInstance();
        Life life4 = Life.getInstance();
        if (life1 == life4 && life2 == life3) {
            System.out.println("the same instance");
        } else {
            System.out.println("different instances");
        }
    }
}
/**
 * Czy juniora obowiązuje pełna wersja Singletona, bezpieczna wielowątkowo??
 */
