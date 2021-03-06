/**
 * operators/PassObject.java
 */
package ru.arcticweb.operators;

import static net.mindview.util.Print.*;

class Letter {
    char c;
}

/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }
    
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c = " + x.c);
        f(x);
        print("2: x.c = " + x.c);
    }
}
