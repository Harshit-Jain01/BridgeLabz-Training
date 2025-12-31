package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

class Student{
    private int studentId;
    private String name;
    private List<Course> courses=new ArrayList<>();

    // Creates a student
    Student(int studentId,String name){
        this.studentId=studentId;
        this.name=name;
    }

    // Enrolls student into a course (association)
    void enrollCourse(Course course){
        courses.add(course);
    }

    // Displays courses enrolled by the student
    void showCourses(){
        System.out.println("Courses of "+name+":");
        // Iterates through enrolled courses
        for(Course c:courses){
            System.out.println(c.getCourseName());
        }
    }

    String getName(){
        return name;
    }
}
