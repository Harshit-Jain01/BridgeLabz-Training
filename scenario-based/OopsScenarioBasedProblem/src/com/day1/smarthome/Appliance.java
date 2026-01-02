package com.day1.smarthome;

public abstract class Appliance implements Controllable {

    private boolean isOn;          // Encapsulation
    private int powerUsage;        // in watts

    // Default power setting
    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    // User-defined power setting
    public Appliance(int powerUsage, boolean state) {
        this.powerUsage = powerUsage;
        this.isOn = state;
    }

    protected void setState(boolean state) {
        this.isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public abstract String getApplianceName();
}
