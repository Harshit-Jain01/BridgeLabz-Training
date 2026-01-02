package com.day1.smarthome;

public class Light extends Appliance {

    public Light() {
        super(20); // default 20W
    }

    public Light(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Light turned ON (Soft glow)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public String getApplianceName() {
        return "Light";
    }
}

