package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 28.05.14.
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("from f()");
    }
    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
