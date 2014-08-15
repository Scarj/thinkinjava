package ru.arcticweb.reusing;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 09.05.14.
 */
class Art {
    Art() {
        print("Конструктор Art()");
    }
}
class Drawing extends Art {
    Drawing() {
        print("Конструктор Drawing()");
    }
}
public class Cartoon extends Drawing {
    public Cartoon() {
        print("Конструктор Cartoon()");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
