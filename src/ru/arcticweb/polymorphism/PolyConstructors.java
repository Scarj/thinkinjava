package ru.arcticweb.polymorphism;

import static net.mindview.util.Print.print;

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    Glyph() {
        print("Glyph() перед вызовом draw()");
        draw();
        print("Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int radius) {
        this.radius = radius;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
