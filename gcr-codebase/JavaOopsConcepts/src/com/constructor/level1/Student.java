package com.constructor.level1;

class Student {

    
    public int rollNumber;
    protected String name;
    private double CGPA;

    // constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    //access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA");
        }
    }
}


