package ru.arcticweb.initialization;

/**
 *  @author evgeniy
 */
class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

/**
 * @author evgeniy
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
