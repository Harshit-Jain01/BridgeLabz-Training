package com.lambdaexpression.smarthome;

public class UseSmartHome {
	public static void main(String[] args) {

		Light control = new Light();
		// Adding trigger
		control.addTrigger("NIGHT", () -> System.out.println("Dim warm lights ON"));
		control.addTrigger("DAYTIME", () -> System.out.println("Lights dimmed, yellow lighting"));
		control.addTrigger("MOTION", () -> System.out.println("Lights ON at full brightness"));
		
		// Activating those methods
		control.activate("MOTION");
		control.activate("DAYTIME");
		control.activate("NIGHT");
	}
}