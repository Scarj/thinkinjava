package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 28.05.14.
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("Создание исключения в f()");
        throw new Exception("возбуждено в f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("в методе g(), e.printStackTrace(System.out)");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("в методе f(), e.printStackTrace(System.out)");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: e.printStackTrace(System.out)");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main: e.printStackTrace(System.out)");
            e.printStackTrace(System.out);
        }

    }
}
