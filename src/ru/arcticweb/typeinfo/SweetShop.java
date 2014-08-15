package ru.arcticweb.typeinfo;

class Candy {
    static {
        System.out.println("Загрузка класс Candy");
    }
}

class Gum {
    static {
        System.out.println("Загрузка класс Gum");
    }
}

class Cookie {
    static {
        System.out.println("Загрузка класс Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("в методе main()");
        new Candy();
        System.out.println("После создания объекта Candy");

        try {
            Class.forName("ru.arcticweb.typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс Gum не найден");
        }

        System.out.println("После вызова метода Class.forName(\"Gum\")");


        new Cookie();
        System.out.println("После создания объекта Cookie");
    }
}
