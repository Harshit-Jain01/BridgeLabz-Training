package com.day1.employeesystem;

public class Employee {
	String id,name,dept,gender;
	int age,year;
	double salary;
	public Employee(String id, String name, String dept, String gender, int age, int year, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.gender = gender;
		this.age = age;
		this.year = year;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", gender=" + gender + ", age=" + age
				+ ", year=" + year + ", salary=" + salary + "]";
	}
	
	
	
}
