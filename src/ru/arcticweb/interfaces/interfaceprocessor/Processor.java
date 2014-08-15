package ru.arcticweb.interfaces.interfaceprocessor;

public interface Processor {
    String name();
    Object process(Object input);
}
