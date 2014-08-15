/**
 * operators/AutoInc.java
 */
package ru.arcticweb.operators;

import static net.mindview.util.Print.*;
/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print ("i: " + i);
        print ("++i: " + ++i);
        print ("i++: " + i++);
        print ("i: " + i);
        
        print ("--i: " + --i);
        print ("i--: " + i--);
        print ("i: " + i);
    }

}
