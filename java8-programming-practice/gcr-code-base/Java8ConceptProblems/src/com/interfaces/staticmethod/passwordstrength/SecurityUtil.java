package com.interfaces.staticmethod.passwordstrength;

import java.util.List;
import java.util.regex.Pattern;

public interface SecurityUtil{

	public static void checkPassword(List<String>list) {

		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";

		
		Pattern pattern = Pattern.compile(regex);

		//checking in the list of all passwords
		for (String password : list) {

			boolean isValid = pattern.matcher(password).matches();

			if (isValid) {
				System.out.println(password + " is STRONG");
			} else {
				System.out.println(password + " is WEAK");
			}
		}
	}
}