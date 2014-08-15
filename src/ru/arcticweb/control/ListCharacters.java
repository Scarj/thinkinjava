/**
 * 
 */
package ru.arcticweb.control;

/**
 * @author Evgeniy Scherbakov
 * @author evgeniy.scherbakov@gmail.com
 */
public class ListCharacters {
	public static void main(String[] args) {
		for(char c = 0; c < 128; c++) {
			if(Character.isLowerCase(c)) {
				System.out.println("значение " + (int)c + " символ: " + c);
			}
		}
	}

}
