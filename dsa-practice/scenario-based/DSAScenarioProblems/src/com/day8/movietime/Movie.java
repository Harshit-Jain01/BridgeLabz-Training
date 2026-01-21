package com.day8.movietime;

import java.time.LocalTime;

public class Movie {
	
 private String name;
 private LocalTime time;
	public Movie(String name, LocalTime time) {
		super();
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	

}
