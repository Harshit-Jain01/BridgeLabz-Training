package com.day1.functionalinterface.predicate;

import java.util.function.Predicate;

public class EvenOddCheck {

	 public static void main(String[] args) {

	        Predicate<Integer> isEven = number -> number % 2 == 0;

	        int num = 15;

	        System.out.println(
	            isEven.test(num)
	            ? "Number is Even"
	            : "Number is Odd"
	        );
	    }
	}
