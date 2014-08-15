package ru.arcticweb.control;

import java.util.Random;

import static net.mindview.util.Print.*;
/**
 * Created by evgeniy on 08.05.14.
 */
public class VowelsAndConsonats {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print("гласная");
                    break;
                case 'y':
                case 'w':
                    print("условно гласная");
                    break;
                default:
                    print("согласная");
                    break;
            }
        }
    }
}
