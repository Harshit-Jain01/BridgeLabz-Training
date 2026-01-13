package com.day8.devicemanager;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Device> devices = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void registerDevice(Device device) {
        devices.add(device);
        System.out.println(device.getDeviceId() + " registered to " + name);
    }
}
