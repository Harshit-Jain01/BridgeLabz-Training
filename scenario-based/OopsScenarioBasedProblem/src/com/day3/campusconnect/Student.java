package com.day3.campusconnect;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements ICourseActions {

    private List<Integer> grades = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.isEmpty() ? 0 : (double) sum / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
