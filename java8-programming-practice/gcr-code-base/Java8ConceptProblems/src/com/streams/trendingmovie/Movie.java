package com.streams.trendingmovie;

public class Movie {
	String name;
	int rating;
	int year;
	public Movie(String name, int rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	public String toString() {
		return name+" "+rating+" "+year;
	}
	

}
