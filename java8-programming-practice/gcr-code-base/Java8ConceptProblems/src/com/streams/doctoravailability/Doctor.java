package com.streams.doctoravailability;

public class Doctor {
	String name;
	boolean isAvailable;
	String specialist;
	public Doctor(String name, boolean isAvailable, String specialist) {
		super();
		this.name = name;
		this.isAvailable = isAvailable;
		this.specialist = specialist;
	}
	
	public String toString() {
		return name+" "+specialist;
	}
	

}
