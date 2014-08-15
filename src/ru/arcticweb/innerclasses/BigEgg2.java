package ru.arcticweb.innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 24.05.14.
 */

class Egg2 {
    protected class Yolk {
        public Yolk() {
            print("Egg2.Yolk()");
        }
        public void f(){
            print("Egg2.f()");
        }
    }
    private Yolk y = new Yolk();

    public Egg2() {
        print("New Egg2()");
    }

    public void insertYolk(Yolk yolk) {
        y = yolk;
    }

    public void g() { y.f();}
}
public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            print("BigEgg2.Yolk()");
        }
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 eg = new BigEgg2();
        eg.g();
    }
}
