package com.day1.studentsystem;

public class Student {

    String id;
    String firstname;
    String name;
    String gender;
    String city;
    String contact;
    String branch;  
    int age;
    int rank;

    public Student(String id, String firstname, String name,
                   String gender, String city, String contact,
                   String branch, int age, int rank) {

        this.id = id;
        this.firstname = firstname;
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.contact = contact;
        this.branch = branch;
        this.age = age;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", firstname=" + firstname +
                ", name=" + name +
                ", gender=" + gender +
                ", city=" + city +
                ", branch=" + branch +
                ", contact=" + contact +
                ", age=" + age +
                ", rank=" + rank + "]";
    }
}
