package ru.arcticweb.polymorphism;

import static net.mindview.util.Print.print;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        print("Создаем Characteristic " + s);
    }
    protected void dispose() {
        print("Завершаем Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        print("Создаем Description " + s);
    }

    protected void dispose() {
        print("Завершаем Description " + s);
    }
}

class LivingCreature {
    private Characteristic characteristic = new Characteristic("живое существо");
    private Description description = new Description("обычное живое существо");

    LivingCreature() {
        print("LivingCreature()");
    }
    protected void dispose() {
        print("dispose() в LivingCreature ");
        description.dispose();
        characteristic.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic characteristic = new Characteristic("имеет сердце");
    private Description description = new Description("животное, не растение");

    Animal() {
        print("Animal()");
    }

    @Override
    protected void dispose() {
        print("dispode в Animal ");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic characteristic = new Characteristic("может жить в воде");
    private Description description = new Description("и в воде, и на земле");

    Amphibian() {
        print("Amphibian");
    }

    @Override
    protected void dispose() {
        print("dispode в Amphibian");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("квакает");
    private Description description = new Description("ест жуков");

    public Frog() {
        print("Frog()");
    }

    @Override
    protected void dispose() {
        print("Завершение Frog()");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Пока");
        frog.dispose();
    }
}
