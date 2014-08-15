package ru.arcticweb.exceptions;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 29.05.14.
 */
public class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() { state = true; print(this); }
    public void off() { state = false; print(this); }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}
