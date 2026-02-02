package com.interfaces.functional.temperaturalert;

import java.util.List;

public class UseTemperature {
	public static void main(String[] args) {

		List<Integer> temprature = List.of(2, 3, 5, 7, 8, 8, 5, 4);

		// threshold temperature
		int threshold = 3;

		// implementation of abstract method
		CheckTemperature check = (temp) -> temp > threshold;

		System.out.println("Checking the temperature :");
		for (Integer i : temprature) {
			if (check.threshold(i)) {
				System.out.println("ALERT! Temperature too high: " + i);
			} else {
				System.out.println("Temperature normal : " + i);
			}
		}

	}

}