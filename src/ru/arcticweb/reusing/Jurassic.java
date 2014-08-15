package ru.arcticweb.reusing;

class SmallBrain {

}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() { }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "i=" + i +
                ", j=" + j +
                ", x=" + x +
                '}';
    }
}

//! class Further extends Dinosaur {
//!
//! }


public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
        System.out.println(n);
    }
}
