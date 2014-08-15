package ru.arcticweb.innerclasses;

public class Parcel5 {
    public Destination destination(String s) {

        class PDestination implements Destination {
            private String label;

            PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return this.label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Танзания");
    }
}
