package com.day3.campusconnect;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Faculty faculty;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Total Students: " + students.size());
    }
}
