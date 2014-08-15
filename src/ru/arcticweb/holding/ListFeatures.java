package ru.arcticweb.holding;

import ru.arcticweb.typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by evgeniy on 26.05.14.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Humster humster = new Humster();
        pets.add(humster);
        print("2: " + pets);
        print("3: " + pets.contains(humster));
        pets.remove(humster);
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        print("7: " + pets.remove(p));
        print("8: " + pets);
        pets.add(3, new Mouse());
        print("9: " + pets);
        List<Pet> sub = pets.subList(1,4);
        print("subLust: " + sub);
        print("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        print("sorted subList: " + sub);
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub,random);
        print("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1),pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        print("14: " + copy);
        copy.removeAll(sub);
        print("15: " + copy);
        copy.set(1, new Mouse());
        print("16: " + copy);
        copy.addAll(2, sub);
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear();
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] objects = pets.toArray();
        print("22: " + objects[3]);
        Pet[] pets1 = pets.toArray(new Pet[0]);
        print("23: " + pets1[3].id());

    }
}
