package ru.arcticweb.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evgeniy on 24.05.14.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event event) { eventList.add(event); }

    public void run() {
        while (eventList.size()>0) {
            for (Event e : new ArrayList<Event>(eventList)) {
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
