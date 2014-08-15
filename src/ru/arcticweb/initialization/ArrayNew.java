package ru.arcticweb.initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(20);
        int[] a = new int[rand.nextInt(20)];
        print("Длина a = " + a.length);
        print(Arrays.toString(a));
    }
}
