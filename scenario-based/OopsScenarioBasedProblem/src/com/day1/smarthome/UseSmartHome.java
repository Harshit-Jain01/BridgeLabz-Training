package com.day1.smarthome;

public class UseSmartHome{
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(90);
        Appliance ac = new AC();

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        controller.compareEnergy(ac, fan);
        controller.compareEnergy(light, fan);

        controller.controlDevice(ac, false);
    }
}
 
