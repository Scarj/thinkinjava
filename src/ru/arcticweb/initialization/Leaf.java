package ru.arcticweb.initialization;

/**
 * Created by evgeniy on 08.05.14.
 */
public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
