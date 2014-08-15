package ru.arcticweb.holding;

import ru.arcticweb.typeinfo.pets.Cat;
import ru.arcticweb.typeinfo.pets.Dog;
import ru.arcticweb.typeinfo.pets.Hamster;
import ru.arcticweb.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by evgeniy on 27.05.14.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String,Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));

    }
}
