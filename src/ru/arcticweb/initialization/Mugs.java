package ru.arcticweb.initialization;

import static net.mindview.util.Print.*;

class Mug {
    Mug(int marker) {
        print("Mug(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1 & mug2 инициализированы");
    }

    Mugs() {
        print("Mugs()");
    }

    Mugs(int i) {
        print("Mugs(int)");
    }

    public static void main(String[] args) {
        print("в методе main()");
        new Mugs();
        print("new Mugs() завершено");
        new Mugs(1);
        print("new Mugs(1) завершено");

    }
}
