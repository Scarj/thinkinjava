package ru.arcticweb.initialization;

import static net.mindview.util.Print.*;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Конструктор с параметром int, petalCount= " + petalCount);
    }

    Flower(String s) {
        print("Конструктор с параметром String, s= " + s);
        this.s = s;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        print("Аргументы String и int");
    }

    Flower() {
        this("hi",47);
        print("конструктор по умолчанию (без аргументов)");
    }

    void printPetalCount() {
        //! this(11);
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
