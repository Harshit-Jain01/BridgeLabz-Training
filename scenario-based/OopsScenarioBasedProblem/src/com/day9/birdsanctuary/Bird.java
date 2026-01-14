package com.day9.birdsanctuary;

public abstract class Bird {
	
	private int id;
	private String name;
	private String species;
	
	public abstract void eat();

	public Bird(int id, String name, String species) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public void displayInfo() {
	    System.out.println("ID: " + id);
	    System.out.println("Name: " + name);
	    System.out.println("Species: " + species);
	    System.out.println("Can Fly: " + (this instanceof Flyable));
	    System.out.println("Can Swim: " + (this instanceof Swimmable));
	}
	
}
