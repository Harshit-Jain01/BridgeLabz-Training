package com.day8.devicemanager;

public abstract class Device implements IControllable {

    private String deviceId;
    private boolean status;          
    protected double energyUsage;    

    protected Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double addEnergy(Device other) {
        return this.energyUsage + other.energyUsage;
    }

    protected void firmwareUpdateLog(String msg) {
        System.out.println("[Firmware Log] " + msg);
    }
}
