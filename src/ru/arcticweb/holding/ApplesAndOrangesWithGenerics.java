package ru.arcticweb.holding;

import java.util.ArrayList;

/**
 * Created by evgeniy on 24.05.14.
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //! apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).getId());
        }

        for (Apple c: apples) {
            System.out.println(c.getId());
        }

    }
}
