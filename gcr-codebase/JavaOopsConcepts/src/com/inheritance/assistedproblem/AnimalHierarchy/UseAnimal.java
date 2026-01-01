package com.inheritance.assistedproblem.AnimalHierarchy;

public class UseAnimal {
	public static void main(String[] args) {
		
		Animal a=new Dog("Tommmy",6);
		a.makeSound();
		
		a=new Cat("Dora",7);
		a.makeSound();
		
		a=new Bird("jenny",1);
		a.makeSound();
	}
}
