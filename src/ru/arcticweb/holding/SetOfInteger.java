package ru.arcticweb.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by evgeniy on 27.05.14.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
