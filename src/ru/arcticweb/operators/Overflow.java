/**
 * 
 */
package ru.arcticweb.operators;

/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class Overflow {

	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("большое = " + big);
		int biger = big * 4;
		System.out.println("еще больше = " + biger);
	}

}
