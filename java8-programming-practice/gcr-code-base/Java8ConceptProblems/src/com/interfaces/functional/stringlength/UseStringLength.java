package com.interfaces.functional.stringlength;

import java.util.Arrays;
import java.util.List;

public class UseStringLength {
	public static void main(String[] args) {

		List<String> list = Arrays.asList(
			    "The rain stopped just before the sun came out.",
			    "He found.",
			    "Music makes long journeys feel shorter.",
			    "The coffee was still warm on the table.",
			    "She wrote"
			);

		CheckLength find = (s) -> s.length();

		int charLimit = 15;

		System.out.println("String Length Checker ");
		for (String s : list) {

			if (find.limit(s) > charLimit) {
				System.out.println(s + " -> message exceeds character limit ");
			} else {
				System.out.println(s + " ->  message do not exceeds character limit");
			}
		}

	}

}