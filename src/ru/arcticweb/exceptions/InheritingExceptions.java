package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 27.05.14.
 */

class SimpleException extends Exception { }

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Возбуждаем SimpleException в f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();

        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Перехвачено");
        }
    }

}
