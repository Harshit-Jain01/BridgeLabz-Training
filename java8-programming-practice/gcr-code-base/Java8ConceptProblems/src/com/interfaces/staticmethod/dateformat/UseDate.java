package com.interfaces.staticmethod.dateformat;

import java.time.LocalDate;

public class UseDate {
	
	public static void main(String[] args) {

		LocalDate input = LocalDate.now();

		String one = DateUtils.formatDate(input, "yyyy-MM-dd");
		String two = DateUtils.formatDate(input, "dd-MM-yyyy");

		System.out.println("Date in format1 :" + one);
		System.out.println("Date in format2 :" + two);
	}
}
