//: ru.arcticweb.object/HelloDate
package ru.arcticweb.object;

import java.util.Date;

/**
 * Первая программа-пример из книги
 * выводит строку и текущее число
 * @author Evgeniy Scherbakov
 *
 */
public class HelloDate {
    /**
     * Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws exceptions  Исключения не выдаются
     */
	public static void main(String[] args) {
		System.out.println("Привет, сегодня: ");
		System.out.println(new Date());
	}
} /* Output: (55% match)
Привет, сегодня: 
Thu May 01 01:41:47 MSK 2014
*///~
