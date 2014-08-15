package ru.arcticweb.initialization;

class A {
    int i;
}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] {
                new Integer(47), new Float(3.14f), new Double(11.11)
        });
        printArray(new Object[]{"раз","два","три"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}
