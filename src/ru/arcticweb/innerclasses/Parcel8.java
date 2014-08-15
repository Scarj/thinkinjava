package ru.arcticweb.innerclasses;

/**
 * Created by evgeniy on 24.05.14.
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.getI()*47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
