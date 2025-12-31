package com.objectmodelling.level1;

public class UseCompany {

	public static void main(String[] args) {
		Company company = new Company("TechCorp");
		Department dev = new Department("Development");
		dev.addEmployee(101, "Raman");
		dev.addEmployee(102, "Jiya");
		Department hr = new Department("HR");
		hr.addEmployee(201, "Kiran");
		company.addDepartment(dev);
		company.addDepartment(hr);
		company.displayCompany();
		company = null;
		System.out.println("Company deleted. Departments and Employees also removed.");
	}
}
