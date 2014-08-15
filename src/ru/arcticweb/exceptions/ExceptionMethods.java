package ru.arcticweb.exceptions;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 28.05.14.
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("Мое исключение");
        } catch (Exception e) {
            print("Перехвачено");
            print("getMessage(): " + e.getMessage());
            print("e.getLocalizedMessage(): " + e.getLocalizedMessage());
            print("toString: " + e);
            print("printStackTrace: ");
            e.printStackTrace(System.out);
        }
    }
}
