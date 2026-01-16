package com.day5.cinemahouse;

import java.time.LocalTime;

public class CinemaHouse {
	
	public static void main(String[] args) {
		
		LocalTime []arr= {
				LocalTime.of(21,34,45),
				LocalTime.of(9,30,15),
				LocalTime.of(23,4,45),
				LocalTime.of(10,3,45),		
		};
		System.out.println("Before sorting");
		for(LocalTime t:arr) {
			System.out.println(t);
		}
		
		MovieTime.sortTime(arr);
		System.out.println("After sorting");
		for(LocalTime t:arr) {
			System.out.println(t);
		}
		
	}
	
	
}
