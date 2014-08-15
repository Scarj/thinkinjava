package ru.arcticweb.polymorphism;

import static net.mindview.util.Print.print;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    Shared() {
        print("Создаем " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if(--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    Composing(Shared shared) {
        print("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing{ id=" + id + '}';
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };
        for (Composing composing: composings) {
            composing.dispose();
        }
    }
}
