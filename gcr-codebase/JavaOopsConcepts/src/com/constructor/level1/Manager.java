package com.constructor.level1;

class Manager extends Employee {

    String designation;

    public Manager(int employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);    
        System.out.println("Salary: " + getSalary());      
        System.out.println("Designation: " + designation);
    }
}
