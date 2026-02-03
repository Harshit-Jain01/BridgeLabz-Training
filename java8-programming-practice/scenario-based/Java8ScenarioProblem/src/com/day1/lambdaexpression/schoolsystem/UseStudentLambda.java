package com.day1.lambdaexpression.schoolsystem;

import java.util.ArrayList;
import java.util.List;

public class UseStudentLambda {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Harshit", 20, 12, 78));
        students.add(new Student("Amit", 17, 45, 35));
        students.add(new Student("Neha", 19, 33, 82));
        students.add(new Student("Rohit", 16, 8, 65));

        // 1. welcome message
        System.out.println("Welcome messages:");
        students.forEach(s ->
                System.out.println("Welcome " + s.name)
        );

        // 2. pass or fail
        System.out.println("\nPass / Fail:");
        students.forEach(s ->
                System.out.println(s.name + " : " + (s.marks >= 40 ? "Pass" : "Fail"))
        );

        // 3. sort by name
        System.out.println("\nSorted by name:");
        students.stream()
                .sorted((a, b) -> a.name.compareTo(b.name))
                .forEach(s -> System.out.println(s.name));

        // 4. sort by rank
        System.out.println("\nSorted by rank:");
        students.stream()
                .sorted((a, b) -> a.rank - b.rank)
                .forEach(s -> System.out.println(s.name + " " + s.rank));

        // 5. age above 18
        System.out.println("\nAge above 18:");
        students.stream()
                .filter(s -> s.age > 18)
                .forEach(s -> System.out.println(s.name + " " + s.age));
    }
}
