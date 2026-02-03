package com.day1.lambdaexpression.officesystem;

import java.util.ArrayList;
import java.util.List;

public class UseEmployeeLambda {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amit", 28000, 2));
        employees.add(new Employee("Neha", 45000, 5));
        employees.add(new Employee("Rohit", 32000, 4));
        employees.add(new Employee("Pooja", 25000, 1));

        // 1. calculate bonus (salary > 30000)
        System.out.println("Employee Bonus:");
        employees.forEach(e -> {
            if (e.salary > 30000) {
                System.out.println(e.name + " bonus: " + (e.salary * 0.10));
            } else {
                System.out.println(e.name + " bonus: 0");
            }
        });

        // 2. sort employees by salary
        System.out.println("\nEmployees sorted by salary:");
        employees.stream()
                .sorted((a, b) -> (int)(a.salary - b.salary))
                .forEach(e -> System.out.println(e.name + " " + e.salary));

        // 3. promotion eligibility (experience > 3 years)
        System.out.println("\nPromotion eligibility:");
        employees.forEach(e ->
                System.out.println(
                        e.name + " : " + (e.experience > 3 ? "Eligible" : "Not Eligible")
                )
        );

        // 4. print employee details
        System.out.println("\nEmployee details:");
        employees.forEach(e -> System.out.println(e));

        // 5. compare two employees salary
        System.out.println("\nSalary comparison (first two employees):");
        Employee e1 = employees.get(0);
        Employee e2 = employees.get(1);

        System.out.println(
                e1.name + " vs " + e2.name + " : " +
                (e1.salary > e2.salary ? e1.name + " has higher salary" : e2.name + " has higher salary")
        );
    }
}
