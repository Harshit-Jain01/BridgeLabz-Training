package com.day1.smarthome;

public class AC extends Appliance {

    public AC() {
        super(1500); 
    }

    public AC(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("AC turned ON (Cooling mode)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("AC turned OFF");
    }

    @Override
    public String getApplianceName() {
        return "AC";
    }
}
