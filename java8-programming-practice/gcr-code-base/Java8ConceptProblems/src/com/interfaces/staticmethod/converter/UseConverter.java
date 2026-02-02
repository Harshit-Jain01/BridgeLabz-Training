package com.interfaces.staticmethod.converter;

public class UseConverter {
public static void main(String[]args) {
		
		// method to convert kg to lbs
		System.out.println(ConvertUtil.convertKgToLbs(15));
		System.out.println(ConvertUtil.convertKgToLbs(90));
		
		// method to convert km to miles
		System.out.println(ConvertUtil.convertKmToMiles(75));
		System.out.println(ConvertUtil.convertKmToMiles(89));
	}
}
