package ru.arcticweb.initialization;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 09.05.14.
 */
public class InitialValues2 {
    boolean aBoolean = true;
    char aChar = 'x';
    byte aByte = 47;
    short aShort = 0xff;
    int anInt = 999;
    long aLong = 1;
    float aFloat = 3.14f;
    double aDouble = 3.14159;

    void printInitValues() {
        print("Тип данных   Начальное значение");
        print("boolean      " + aBoolean);
        print("char         [" + aChar + "]");
        print("byte         " + aByte);
        print("short        " + aShort);
        print("int          " + anInt);
        print("long         " + aLong);
        print("float        " + aFloat);
        print("double       " + aDouble);
    }

    public static void main(String[] args) {
        new InitialValues2().printInitValues();
    }
}
