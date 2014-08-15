package ru.arcticweb.initialization;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 09.05.14.
 */
public class InitialValues {
    boolean aBoolean;
    char aChar;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    InitialValues initialValues;
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
        print("initValues   " + initialValues);
    }

    public static void main(String[] args) {
        new InitialValues().printInitValues();
    }
}
