package com.day1.smarthome;

public class Fan extends Appliance {

    public Fan() {
        super(75); // default 75W
    }

    public Fan(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Fan turned OFF");
    }

    @Override
    public String getApplianceName() {
        return "Fan";
    }
}
