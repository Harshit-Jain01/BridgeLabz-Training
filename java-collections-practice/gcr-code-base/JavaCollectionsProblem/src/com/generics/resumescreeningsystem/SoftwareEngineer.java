package com.generics.resumescreeningsystem;

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void screenResume() {
        System.out.println("Checking DSA, OOP, System Design, Coding Skills");
    }
}
