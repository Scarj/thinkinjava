package ru.arcticweb.holding;

import java.util.Arrays;

/**
 * Created by evgeniy on 27.05.14.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t: ib ){
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3,4,5));
        String[] strings = {"A", "B", "C"};

        //! test(strings);

        test(Arrays.asList(strings));
    }
}
