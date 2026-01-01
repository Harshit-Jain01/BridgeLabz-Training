package com.inheritance.assistedproblem.employeemgt;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Emp  id is "+getId());
		System.out.println("Emp  name is "+getName());
		System.out.println("Emp  salary is "+getSalary());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}
