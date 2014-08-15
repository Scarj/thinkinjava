package ru.arcticweb.reusing;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 09.05.14.
 */

class Soap {
    private String string;
    Soap() {
        print("Soap()");
        string = "Constructed";
    }

    @Override
    public String toString() {
        return string;
    }
}

public class Bath {
    private String s1 = "Счастливый",
                   s2 = "Счастливый",
                   s3,s4;

    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        print("В конструкторе Bath()");
        s3 = "Радостный";
        toy = 3.14f;
        castille = new Soap();
    }
    { i = 47; }

    @Override
    public String toString() {
        if(s4==null) s4 = "Отложенный";
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}
