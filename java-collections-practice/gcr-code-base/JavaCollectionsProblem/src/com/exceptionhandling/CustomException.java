package com.exceptionhandling;

import java.util.Scanner;

//custom checked  exception
class InvalidAgeException extends Exception
{

	public InvalidAgeException(String message) {
		super(message);
	}
	
}
public class CustomException  {
	
	public static void validateAge(int age) throws  InvalidAgeException {
		if(age >=18)
			System.out.println("Access granted!");
		else 
			throw new InvalidAgeException("Age is below 18");
	}
	
	public static void main(String[] args)   {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the age");
		int age=kb.nextInt();
		try {
			validateAge(age);
		}catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		finally {
			kb.close();
		}
	}

}
