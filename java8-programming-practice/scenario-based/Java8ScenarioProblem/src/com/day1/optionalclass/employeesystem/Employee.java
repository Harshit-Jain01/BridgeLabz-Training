package com.day1.optionalclass.employeesystem;


public class Employee {

    int id;
    String firstName;
    String middleName;
    String lastName;
    String email;
    String manager;
    Double bonus;
    String insurance;

    public Employee(int id, String firstName, String middleName, String lastName,
                    String email, String manager, Double bonus, String insurance) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.manager = manager;
        this.bonus = bonus;
        this.insurance = insurance;
    }
}
