package ru.arcticweb.holding;

import java.util.Map;

/**
 * Created by evgeniy on 27.05.14.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
