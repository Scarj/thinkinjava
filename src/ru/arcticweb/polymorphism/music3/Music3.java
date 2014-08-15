package ru.arcticweb.polymorphism.music3;

import ru.arcticweb.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Instrument {
    void play(Note n) {
        print("Instrument Play(" + n + ")");
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        print("Wind.play(" + n + ")");
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        print("Percussion.play(" + n + ")");
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        print("Stringed.play("+n+")");
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        print("Brass.play("+n+")");
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}

class WoodWind extends Wind {
    @Override
    void play(Note n) {
        print("WoodWind.play("+n+")");
    }

    @Override
    String what() {
        return "WoodWind";
    }
}

public class Music3 {
    public static void tune (Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
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
                new WoodWind()
        };
        tuneAll(orchestra);
    }
}
