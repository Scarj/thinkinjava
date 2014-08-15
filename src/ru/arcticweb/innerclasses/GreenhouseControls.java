package ru.arcticweb.innerclasses;

import ru.arcticweb.innerclasses.controller.Controller;
import ru.arcticweb.innerclasses.controller.Event;

/**
 * Created by evgeniy on 24.05.14.
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //реализация включения света
            light = true;
        }

        @Override
        public String toString() {
            return "Свет включен";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //реализация выключения света
            light = false;
        }

        @Override
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Полив включен";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Полив выключен";
        }
    }

    private String thermostat = "День";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Ночь";
        }

        @Override
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "День";
        }

        @Override
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Бам!";
        }
    }

    public class Restart extends Event {
        private Event[] events;

        public Restart(long delayTime,Event[] events) {
            super(delayTime);
            this.events = events;
            for (Event e : events) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event event : events) {
                event.start();
                addEvent(event);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Перезапуск системы";
        }
    }

    public class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение";
        }
    }
}
