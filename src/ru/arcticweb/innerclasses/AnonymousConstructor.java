package ru.arcticweb.innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 24.05.14.
 */

abstract class Base {
    protected Base(int i) {
        print("Конструктор Base, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                print("Инициализация экземпляра");
            }
            @Override
            public void f() {
                print("Безымянный f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
