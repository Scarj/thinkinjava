package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 28.05.14.
 */

class OneException extends Exception {
    public  OneException(String message) {
        super(message);
    }
}

class TwoException extends Exception {
    TwoException(String message) {
        super(message);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("create exception in f()");
        throw new OneException("from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("in inner try-block, stacktrace");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try-block");
            }
        }catch (TwoException e) {
            System.out.println("in outer try-block");
            e.printStackTrace(System.out);
        }
    }
}
