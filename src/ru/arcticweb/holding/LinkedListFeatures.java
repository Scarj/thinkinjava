package ru.arcticweb.holding;

import ru.arcticweb.typeinfo.pets.Hamster;
import ru.arcticweb.typeinfo.pets.Pet;
import ru.arcticweb.typeinfo.pets.Pets;
import ru.arcticweb.typeinfo.pets.Rat;

import java.util.LinkedList;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 27.05.14.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        print(pets);
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
        print("pets.peek(): " + pets.peek());

        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());

        print("pets.poll(): " + pets.poll());
        print(pets);

        pets.addFirst(new Rat());
        print("after addFirst: " + pets);
        pets.offer(Pets.randomPet());
        print("after offer(): " + pets);
        pets.add(Pets.randomPet());
        print("after add(): " + pets);
        pets.addLast(new Hamster());
        print("after addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());
    }
}
