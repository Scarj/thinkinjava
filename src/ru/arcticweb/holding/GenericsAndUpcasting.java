package ru.arcticweb.holding;

import java.util.ArrayList;

/**
 * Created by evgeniy on 24.05.14.
 */
class GrannySmith extends Apple { }
class Gala extends Apple { }
class Fuji extends Apple { }
class Braeburn extends Apple { }

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
