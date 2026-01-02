package com.day1.smarthome;

public class UserController {

    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    // Operator usage for energy comparison
    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println(a1.getApplianceName() + " uses more power than " + a2.getApplianceName());
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println(a2.getApplianceName() + " uses more power than " + a1.getApplianceName());
        } else {
            System.out.println("Both appliances use equal power");
        }
    }
}
