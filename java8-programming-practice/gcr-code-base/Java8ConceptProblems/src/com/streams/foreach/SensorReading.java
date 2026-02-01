package com.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class SensorReading {

    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(
                18.5,
                22.3,
                29.8,
                31.2,
                19.6,
                35.0
        );

        double threshold = 25.0;
        System.out.println("Sensor readings above threshold:");

        readings.stream().filter(x->x>threshold).forEach(System.out::println);
    }
}
