package com.day8.movietime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
	public static void main(String[] args) {
		
		Movie m1 = new Movie("ABCD", LocalTime.of(16, 20));
		Movie m2 = new Movie("Inception", LocalTime.of(9, 45));
		Movie m3 = new Movie("Interstellar", LocalTime.of(21, 10));
		Movie m4 = new Movie("Avengers", LocalTime.of(13, 5));
		Movie m5 = new Movie("Joker", LocalTime.of(18, 30));
		
		List<Movie> list = new ArrayList<>(List.of(m1, m2, m3, m4, m5));
		List<Movie> result=SortShowTime.sortTime(list);
		System.out.println("Movie time");
		for(Movie m:result) {
			System.out.println(m.getName()+" "+m.getTime());
		}
		
		
	}
}
