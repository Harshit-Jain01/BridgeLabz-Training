package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

class Course{
    private String courseName;
    private List<Student> students=new ArrayList<>();

    // Creates a course
    Course(String courseName){
        this.courseName=courseName;
    }

    // Adds student to the course (association)
    void addStudent(Student student){
        students.add(student);
    }

    // Displays students enrolled in the course
    void showStudents(){
        System.out.println("Students in "+courseName+":");
        // Iterates through enrolled students
        for(Student s:students){
            System.out.println(s.getName());
        }
    }

    String getCourseName(){
        return courseName;
    }
}
