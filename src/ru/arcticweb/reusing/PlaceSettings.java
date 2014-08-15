package ru.arcticweb.reusing;

import static net.mindview.util.Print.print;

class Plate {
    Plate(int i) {
        print("Конструктор Plate()");
    }
}

class DinnerPlate extends Plate{

    DinnerPlate(int i) {
        super(i);
        print("Конструктор DinnerPlate()");
    }
}

class Utensil {
    Utensil(int i) {
        print("Конструкто Utensil()");
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
        super(i);
        print("Конструктор Spoon()");
    }
}

class Fork extends Utensil {

    Fork(int i) {
        super(i);
        System.out.println("Конструкто Fork()");
    }
}

class Knife extends Utensil {

    Knife(int i) {
        super(i);
        print("Конструктор Knife()");
    }
}

class Custom {
    Custom(int i) {
        print("Конструкто Custom()");
    }
}

public class PlaceSettings extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate plate;

    PlaceSettings(int i) {
        super(i+1);
        spoon = new Spoon(i+2);
        fork = new Fork(i+3);
        knife = new Knife(i+4);
        plate = new DinnerPlate(i+5);
        print("Конструкто PlaceSettings()");
    }

    public static void main(String[] args) {
        PlaceSettings x = new PlaceSettings(9);
    }
}
