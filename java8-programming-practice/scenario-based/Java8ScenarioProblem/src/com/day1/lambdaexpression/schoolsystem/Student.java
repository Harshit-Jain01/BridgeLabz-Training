package com.day1.lambdaexpression.schoolsystem;

public class Student {

    String name;
    int age;
    int rank;
    int marks;

    public Student(String name, int age, int rank, int marks) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Rank: " + rank + " | Marks: " + marks;
    }
}