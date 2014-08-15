package ru.arcticweb.polymorphism;

import static net.mindview.util.Print.print;

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
}

public class PrivateOverride {
    private void f() {
        print(" private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}
