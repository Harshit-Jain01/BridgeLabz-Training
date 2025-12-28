package com.constructor.level1;

public class UseEmployee{

    public static void main(String[] args) {

        Manager mgr = new Manager(501,"IT",74374,"Project Manager");
        mgr.displayDetails();

        // modify salary using public method
        mgr.setSalary(85000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
