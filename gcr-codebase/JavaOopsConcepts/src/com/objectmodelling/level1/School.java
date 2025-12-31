package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

class School{
    private String schoolName;
    private List<Student> students=new ArrayList<>();

    // Creates a school
    School(String schoolName){
        this.schoolName=schoolName;
    }

    // Adds students to the school (aggregation)
    void addStudent(Student student){
        students.add(student);
    }

    // Displays students of the school
    void showStudents(){
        System.out.println("Students of "+schoolName+":");
        // Iterates through school students
        for(Student s:students){
            System.out.println(s.getName());
        }
    }
}
