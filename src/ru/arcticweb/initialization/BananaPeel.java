package ru.arcticweb.initialization;

import static net.mindview.util.Print.print;

class Banana {
    void peel(int i) {
        print(i);
    }
}
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();

        a.peel(1);
        b.peel(2);
    }
}
