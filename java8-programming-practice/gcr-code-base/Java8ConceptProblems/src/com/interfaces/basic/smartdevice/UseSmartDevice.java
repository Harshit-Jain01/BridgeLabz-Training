package com.interfaces.basic.smartdevice;

import java.util.Scanner;

public class UseSmartDevice {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// create devices
	Device livingLight = new Light("Dining Room");
	Device bedroomAC = new AC("Restroom");
	Device hallTV = new TV("Redmi");

	int choice = 0;
	while (choice != 3) {
	    System.out.println("Smart Home Device Control");
	    System.out.println("1 - Turn ON all devices");
	    System.out.println("2 - Turn OFF all devices");
	    System.out.println("3 - Exit");
	    System.out.print("Choose option (1-3): ");

	    choice = input.nextInt();

	    if (choice == 1) {
		System.out.println("Turning ON devices:");
		livingLight.turnOn();
		bedroomAC.turnOn();
		hallTV.turnOn();
	    } else if (choice == 2) {
		System.out.println("Turning OFF devices:");
		livingLight.turnOff();
		bedroomAC.turnOff();
		hallTV.turnOff();
	    } else {
		System.out.println("Exiting");
	    }

	}
	input.close();
    }
}