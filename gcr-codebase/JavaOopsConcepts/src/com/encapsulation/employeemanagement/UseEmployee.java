package com.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class  UseEmployee {
	    public static void main(String[] args) {

	        List<Employee> employees = new ArrayList<>();

	        Employee emp1 = new FullTimeEmployee(1, "Rahul", 45000);
	        emp1.assignDepartment("IT");

	        Employee emp2 = new PartTimeEmployee(2, "Sneha", 60, 400);
	        emp2.assignDepartment("HR");

	        employees.add(emp1);
	        employees.add(emp2);

	        
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
	}


