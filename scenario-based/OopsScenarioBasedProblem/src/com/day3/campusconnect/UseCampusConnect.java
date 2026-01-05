package com.day3.campusconnect;

public class UseCampusConnect{
    public static void main(String[] args) {

        Faculty faculty = new Faculty(101, "Dr. Mehta", "mehta@uni.edu", "Computer Science");

        Student s1 = new Student(1, "Harshit", "harshit@uni.edu");
        Student s2 = new Student(2, "Aman", "aman@uni.edu");

        Course java = new Course("Java Programming", faculty);

        s1.addGrade(8);
        s1.addGrade(9);
        s2.addGrade(7);
        s2.addGrade(8);

        s1.enrollCourse(java);
        s2.enrollCourse(java);

        // Polymorphism
        Person p1 = s1;
        Person p2 = faculty;

        p1.printDetails();
        System.out.println();
        p2.printDetails();
    }
}
