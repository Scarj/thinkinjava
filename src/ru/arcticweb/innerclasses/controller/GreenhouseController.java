package ru.arcticweb.innerclasses.controller;

import ru.arcticweb.innerclasses.GreenhouseControls;

/**
 * Created by evgeniy on 24.05.14.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] events = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(2000,events));
        if(args.length==1) {
            gc.addEvent(gc.new Terminate(new Integer(args[0])));
        } else {
            gc.addEvent(gc.new Terminate(200));
        }
        gc.run();
    }
}
