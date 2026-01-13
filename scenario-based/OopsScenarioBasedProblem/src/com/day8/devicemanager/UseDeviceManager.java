package com.day8.devicemanager;

public class UseDeviceManager {

	    public static void main(String[] args) {

	        User user = new User("Harry");

	        Device light = new Light("L101");
	        Device camera = new Camera("C202");
	        Device lock = new Lock("D303");

	        user.registerDevice(light);
	        user.registerDevice(camera);
	        user.registerDevice(lock);

	        light.turnOn();
	        camera.turnOn();

	        light.reset();
	        camera.reset();
	        lock.reset();

	        System.out.println("Total Energy: " + light.addEnergy(camera));
	    }
	}
