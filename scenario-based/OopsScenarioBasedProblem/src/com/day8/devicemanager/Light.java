package com.day8.devicemanager;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 5.0);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    @Override
    public void reset() {
        System.out.println("Light reset: brightness set to default");
    }
}

