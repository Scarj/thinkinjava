package ru.arcticweb.exceptions;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 28.05.14.
 */
class MyException2 extends Exception {
    private int x;

    MyException2() { }

    MyException2(String message) { super(message); }

    MyException2(String message, int x) {
        super(message);
        this.x = x;
    }

    public int val() {
        return x;
    }

    public String getMessage() {
        return "Подробное сообщение: " + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException2 {
        print("MyException2 in f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        print("MyException2 in g()");
        throw new MyException2("Возбуждено в g()");
    }

    public static void h() throws MyException2 {
        print("MyException2 in h()");
        throw new MyException2("Возбуждено в h()",47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }

        try {
            h();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
            System.out.println("e.val() = " + myException2.val());
        }
    }
}
