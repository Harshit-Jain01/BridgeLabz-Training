package com.day2.traincompanion;

public class Train {
	
	public static void main(String[] args) {
		
		Compartment comp=new Compartment();
		comp.addCompartment("Engine");
		comp.addCompartment("General");
		comp.addCompartment("Pantry");
		
	
		comp.forward();
		comp.searchCompartment("AC");
		
		comp.addCompartment("AC");
		comp.addCompartment("Sleeper");
		
		comp.searchCompartment("Sleeper");
		comp.backward();
		
		comp.adjacentCompartment("sleeper");
		comp.forward();
		
		comp.deleteCompartmet("engine");
		comp.forward();
	}
}
