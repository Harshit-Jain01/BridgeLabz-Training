package com.day5.cropmonitor;

public class SensorData {
    public long timestamp;
    public double temperature;

    public SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Timestamp: " + timestamp + ", Temperature: " + temperature;
    }
}
