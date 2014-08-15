package ru.arcticweb.holding;

import ru.arcticweb.typeinfo.pets.Pet;
import ru.arcticweb.typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by evgeniy on 27.05.14.
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    @Override
    public int size() { return pets.length; }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
