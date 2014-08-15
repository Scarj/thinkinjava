package ru.arcticweb.holding;

import java.util.ArrayList;

/**
 * Created by evgeniy on 24.05.14.
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange { }

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).getId();
        }
    }

}
