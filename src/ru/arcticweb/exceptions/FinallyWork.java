package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 28.05.14.
 */
class ThreeException extends Exception { }

public class FinallyWork {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("finally");
                if(count==2) {
                    break;
                }
            }
        }
    }
}
