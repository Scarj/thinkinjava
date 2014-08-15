package ru.arcticweb.holding;

import ru.arcticweb.typeinfo.pets.Pet;
import ru.arcticweb.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by evgeniy on 26.05.14.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> petIterator = pets.iterator();
        while (petIterator.hasNext()) {
            Pet pet = petIterator.next();
            System.out.print(pet.id() + " " + pet + " ");
        }
        System.out.println();

        for (Pet pet: pets) {
            System.out.print(pet.id() + " " + pet + " ");
        }
        System.out.println();

        petIterator = pets.iterator();

        for (int i = 0; i < 6; i++) {
            petIterator.next();
            petIterator.remove();
        }

        System.out.println(pets);
    }
}
