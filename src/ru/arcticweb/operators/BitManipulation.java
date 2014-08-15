/**
 * BitManipulation.java
 */
package ru.arcticweb.operators;

import java.util.Random;
import static net.mindview.util.Print.print;

/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class BitManipulation {
	public static void main(String[] args) {
		Random rand = new Random(47);
		
		int i = rand.nextInt();
		int j = rand.nextInt();
		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);
		
		int maxpos = 2147483647;
		printBinaryInt("макс. положит.:",maxpos);
		int maxneg = -2147483648;
		printBinaryInt("макс. положит.:",maxneg);
		
		printBinaryInt("i",i);
		printBinaryInt("~i",~i);
		printBinaryInt("-i",-i);
		printBinaryInt("j",j);
		printBinaryInt("i&j",i&j);
		printBinaryInt("i|j",i|j);
		printBinaryInt("i^j",i^j);
		printBinaryInt("i<<5",i<<5);
		printBinaryInt("i>>5",i>>5);
		printBinaryInt("(~i)>>5",(~i)>>5);
		printBinaryInt("i>>>5",i>>>5);
		printBinaryInt("(~i)>>>5",(~i)>>>5);
		
		
	}

	private static void printBinaryInt(String s, int i) {
		print(s + ", int: " + i + ", двоичное: \n\t" + Integer.toBinaryString(i));
	}
	
}
