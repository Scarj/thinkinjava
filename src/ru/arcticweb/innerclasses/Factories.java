package ru.arcticweb.innerclasses;

import static net.mindview.util.Print.*;

public class Factories {
    interface Service {
        void method1();
        void method2();
    }

    interface ServiceFactory {
        Service getService();
    }

    static class Implementation1 implements Service {

        @Override
        public void method1() { print("Реализация1 метода1"); }

        @Override
        public void method2() { print("Реализация1 метода2"); }

        public static ServiceFactory factory = new ServiceFactory() {
            @Override
            public Service getService() {
                return new Implementation1();
            }

        };
    }

    static class Implementation2 implements Service {

        @Override
        public void method1() { print("Реализация2 метода1"); }

        @Override
        public void method2() { print("Реализация2 метода2"); }

        public static ServiceFactory factory = new ServiceFactory() {
            @Override
            public Service getService() {
                return new Implementation2();
            }
        };
    }

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
