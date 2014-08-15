/**
 * 
 */
package ru.arcticweb.operators;

import static net.mindview.util.Print.*;

/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class Literals {

	public static void main(String[] args) {
		int i1 = 0x2f;
		print("i1: " + Integer.toBinaryString(i1));
		int i2 = 0X2F;
		print("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177;
		print("i3: " + Integer.toBinaryString(i3));
		
		char c = 0xffff;
		print("c: " + Integer.toBinaryString(c));
		
		byte b = 0x7f;
		print("b: " + Integer.toBinaryString(b));
		
		short s = 0x7fff;
		print("s: " + Integer.toBinaryString(s));
		
		long n1 = 200L;
		n1 = 200l;
		n1 = 200;
		
		float f1 = 1;
		f1 = 1F;
		f1 = 1f;
		
		double d1 = 1d;
		d1 = 1D;
	}

}
