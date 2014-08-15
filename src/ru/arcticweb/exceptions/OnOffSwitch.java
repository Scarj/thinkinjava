package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 29.05.14.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    static void f() throws OnOffException1, OnOffException2{ }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException1");
            sw.off();
        }
    }
}
