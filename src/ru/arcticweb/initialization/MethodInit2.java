package ru.arcticweb.initialization;

/**
 * Created by evgeniy on 09.05.14.
 */
public class MethodInit2 {
    int i = f();
    int j = g(i);

    private int g(int n) {
        return n*10;
    }

    private int f() {
        return 11;
    }
}
