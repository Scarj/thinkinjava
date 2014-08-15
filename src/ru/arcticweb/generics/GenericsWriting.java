package ru.arcticweb.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evgeniy on 13.08.14.
 */
public class GenericsWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1() {
        writeExact(apples,new Apple());
        //!! writeExact(fruits,new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2(){
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();f2();
    }

}
