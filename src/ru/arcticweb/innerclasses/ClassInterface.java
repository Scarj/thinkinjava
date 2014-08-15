package ru.arcticweb.innerclasses;

/**
 * Created by evgeniy on 24.05.14.
 */
public interface ClassInterface {
    void howdy();

    class Test implements ClassInterface {

        @Override
        public void howdy() {
            System.out.println("Привет");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
