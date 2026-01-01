package com.inheritance.assistedproblem.employeemgt;

public class Intern extends Employee {
	
	public Intern(int id, String name, double salary) {
		super(id,name,salary);
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee is intern");
		
	}
}
