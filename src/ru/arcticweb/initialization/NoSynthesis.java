package ru.arcticweb.initialization;

import static net.mindview.util.Print.print;

class Bird2 {
    Bird2(int i) { print(i);}
    Bird2(double d) {print(d);}
}

public class NoSynthesis {
    public static void main(String[] args) {
        //! Bird2 b = new Bird2(); // No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
        print(b2.toString());
        print(b3.toString());
    }
}