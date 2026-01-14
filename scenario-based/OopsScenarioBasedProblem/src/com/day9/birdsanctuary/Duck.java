package com.day9.birdsanctuary;

public class Duck extends Bird implements Swimmable {

	public Duck(int id, String name) {
		super(id, name,"Duck");
	}

	@Override
	public void eat() {
		System.out.println("Duck eats  roots, frogs, insects");
	}

	@Override
	public void swim() {
		System.out.println("Duck cam swim");
	}

}
