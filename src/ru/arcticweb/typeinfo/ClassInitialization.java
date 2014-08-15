package ru.arcticweb.typeinfo;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static  {
        System.out.println("Инициализация Initable");

    }
}

class Initable2 {
    static final int staticNonFinal = 147;
    static  {
        System.out.println("Инициализация Initable2");
    }
}



class Initable3 {
    static final int staticNonFinal = 147;
    static  {
        System.out.println("Инициализация Initable2");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("После создания ссылки Initable");

        System.out.println(Initable.staticFinal);

        System.out.println(Initable.staticFinal2);

        System.out.println(Initable2.staticNonFinal);

        Class initable3 = Class.forName("ru.arcticweb.typeinfo.Initable3");
        System.out.println("After creations Initable3");
        System.out.println("Hello");


    }
}
