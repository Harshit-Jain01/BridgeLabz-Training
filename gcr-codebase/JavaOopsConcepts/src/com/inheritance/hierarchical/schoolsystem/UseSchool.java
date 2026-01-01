package com.inheritance.hierarchical.schoolsystem;

public class UseSchool{

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Anil", 35, "Mathematics");
        Student student = new Student("Rohit", 16, "10th Grade");
        Staff staff = new Staff("Suresh", 45, "Administration");

        teacher.displayRole();
        System.out.println("-----------");

        student.displayRole();
        System.out.println("-----------");

        staff.displayRole();
    }
}
