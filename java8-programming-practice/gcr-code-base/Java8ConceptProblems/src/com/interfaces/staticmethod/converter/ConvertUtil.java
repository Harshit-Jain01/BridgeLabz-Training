package com.interfaces.staticmethod.converter;

public class ConvertUtil {
	
	//static method of interface
		public static double convertKmToMiles(int value) {
			return value * 0.62;
		}
		
		public static double convertKgToLbs(int value) {
			return value * 2.20462;
		}
}
