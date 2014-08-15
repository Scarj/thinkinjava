package ru.arcticweb.holding;

import ru.arcticweb.typeinfo.pets.Pet;
import ru.arcticweb.typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by evgeniy on 26.05.14.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> petIterator) {
        while (petIterator.hasNext()) {
            Pet pet = petIterator.next();
            System.out.print(pet.id() + ":" + pet +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
