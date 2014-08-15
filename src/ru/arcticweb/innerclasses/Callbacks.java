package ru.arcticweb.innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 24.05.14.
 */

interface Incremental {
    void increment();
}

class Callee1 implements Incremental {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        print(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Другая операция");
    }
    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        print(i);
    }

    private class Closure implements Incremental {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incremental getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incremental callbackReference;

    Caller(Incremental callbackReference) {
        this.callbackReference = callbackReference;
    }

    void go() {
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
