/**
 * 
 */
package ru.arcticweb.control;

import static net.mindview.util.Range.range;
import static net.mindview.util.Print.*;
/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class ForEachInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        for (int i: range(10)) {
            printnb(i + " ");
        }
        print();
        for (int i: range(5,10)) {
            printnb(i + " ");
        }
        print();
        for (int i: range(5,20,3)) {
            printnb(i + " ");
        }
        print();
	}

}