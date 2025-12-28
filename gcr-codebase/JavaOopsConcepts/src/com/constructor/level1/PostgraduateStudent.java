package com.constructor.level1;

class PostgraduateStudent extends Student {

    String branch;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String branch) {
        super(rollNumber, name, CGPA);
        this.branch=branch;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);   
        System.out.println("Name: " + name);                 
        System.out.println("CGPA: " + getCGPA());            
        System.out.println("Specialization: " +branch);
    }
}