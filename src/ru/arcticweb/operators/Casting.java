/**
 * 
 */
package ru.arcticweb.operators;

/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class Casting {

	public void main(String[] args) {
		int i = 200;
		long lng = (long) i;
		lng = i;
		long lng2 = (long)200;
		lng = 200;
		i = (int) lng2;
	}

}
