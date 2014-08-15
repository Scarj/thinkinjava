package ru.arcticweb.exceptions;

/**
 * Created by evgeniy on 29.05.14.
 */
public class WithFunally {
    private static Switch sw = new Switch();
    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException1");
        } finally {
            sw.off();
        }
    }
}
