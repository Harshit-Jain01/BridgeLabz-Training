package com.day9.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

	public Penguin(int id, String name) {
		super(id, name,"Penguin");
	}

	@Override
	public void eat() {
		System.out.println("Penguins eat seafood, primarily krill, squid, and fish");
	}

	@Override
	public void swim() {
		System.out.println("Penguin swims swiftly underwater");

	}

}
