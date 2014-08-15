package ru.arcticweb.generics;

import java.util.List;

/**
 * Created by evgeniy on 13.08.14.
 */
public class SuperTypeWildCards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());
    }
}
