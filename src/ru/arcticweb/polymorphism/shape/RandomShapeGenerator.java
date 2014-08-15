package ru.arcticweb.polymorphism.shape;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random(99);
    public Shape next() {
        int i = random.nextInt(3);
        switch (i) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();

        }
    }
}
