package com.day9.birdsanctuary;

public class Seagull extends Bird implements Flyable,Swimmable {

	

	public Seagull(int id, String name) {
		super(id, name,"Seagull");
	}

	@Override
	public void swim() {
		System.out.println("Saegull can swim");
	}

	@Override
	public void fly() {
		System.out.println("Saegull can fly");
	}

	@Override
	public void eat() {
	System.out.println("Seagull eats fish, marine invertebrates");	
	}

}
