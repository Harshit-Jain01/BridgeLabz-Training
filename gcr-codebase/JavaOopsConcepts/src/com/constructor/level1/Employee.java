package com.constructor.level1;

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }

    // access salary
    public double getSalary() {
        return salary;
    }
}
