package ru.arcticweb.interfaces.music5;

import ru.arcticweb.polymorphism.music.Note;

import static net.mindview.util.Print.print;

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    @Override
    public void adjust() {
        print(this + " adjust()");
    }
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {

    @Override
    public void play(Note n) { print(this + ".play() " + n); }
    @Override
    public void adjust() { print(this + " adjust()"); }
    @Override
    public String toString() { return "Percussion"; }
}

class Stringed implements Instrument {

    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        print(this + " adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass implements Instrument {

    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        print(this + " adjust()");
    }

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind implements Instrument {

    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        print(this + " adjust()");
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for(Instrument i : instruments) {
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
