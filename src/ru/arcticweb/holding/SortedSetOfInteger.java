package ru.arcticweb.holding;

import java.util.*;

/**
 * Created by evgeniy on 27.05.14.
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
