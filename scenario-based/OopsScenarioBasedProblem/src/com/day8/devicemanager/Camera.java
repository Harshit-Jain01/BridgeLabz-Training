package com.day8.devicemanager;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 8.5);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera stopped");
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: memory cleared");
    }
}
