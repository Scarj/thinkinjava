package ru.arcticweb.holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by evgeniy on 27.05.14.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r,freq==null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
