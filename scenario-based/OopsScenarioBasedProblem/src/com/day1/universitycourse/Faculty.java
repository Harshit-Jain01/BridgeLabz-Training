package com.day1.universitycourse;

import java.util.List;

public class Faculty implements Graded {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public void assignGrade(String studentId, double grade) {
        System.out.println("Grade assigned to student " + studentId + " : " + grade);
    }

    // Polymorphism in action
    public void assignGrade(Student student, Course course, double grade) {
        student.addGrade(course.getCourseCode(), grade);
    }
}
