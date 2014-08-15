package ru.arcticweb.reusing;

class Popet {
    private int i;

    Popet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Popet p;


    public BlankFinal() {
        j = 0;
        p = new Popet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Popet(x);
    }

    @Override
    public String toString() {
        return "BlankFinal{" +
                "i=" + i +
                ", j=" + j +
                ", p=" + p +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new BlankFinal());
        System.out.println(new BlankFinal(47));
    }
}
