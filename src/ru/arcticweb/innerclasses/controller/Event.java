package ru.arcticweb.innerclasses.controller;

/**
 * Created by evgeniy on 24.05.14.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    protected Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();


}
