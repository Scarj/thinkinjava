package ru.arcticweb.innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 24.05.14.
 */
class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            print("Egg.Yolk()");
        }
    }

    Egg() {
        print("New Egg()");
        y = new Yolk();
    }
}
public class BigEgg extends Egg{
    public class Yolk {
        public Yolk() {
            print("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
