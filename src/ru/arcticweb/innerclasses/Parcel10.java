package ru.arcticweb.innerclasses;

/**
 * Created by evgeniy on 24.05.14.
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost>100) {
                    System.out.println("Превышение бюджета");
                }
            }
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Тасмания",101.395F);
    }
}
