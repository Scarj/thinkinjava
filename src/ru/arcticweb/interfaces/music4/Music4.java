package ru.arcticweb.interfaces.music4;

import ru.arcticweb.polymorphism.music.Note;

import static net.mindview.util.Print.print;

abstract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String what() { return "Instrument"; }
    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play(" + n + ")");
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Wind";
    }
}

class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        print("Percussion.play(" + n + ")");
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Percussion";
    }
}

class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        print("Stringed.play(" + n + ")");
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Stringed";
    }
}

class Brass extends Instrument {
    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public void play(Note n) {
        print("Brass.play(" + n + ")");
    }

    @Override
    public void adjust() {

    }
}

class Woodwind extends Instrument {

    @Override
    public String what() {
        return "Woodwind";
    }

    @Override
    public void play(Note n) {
        print("Woodwind.play(" + n + ")");
    }

    @Override
    public void adjust() {

    }
}

public class Music4 {

    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
