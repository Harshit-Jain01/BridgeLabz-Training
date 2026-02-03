package com.day1.functionalinterface.predicate;

import java.util.function.Predicate;

public class EmployeeSalaryCheck {
    public static void main(String[] args) {

        Predicate<Double> highSalary = salary -> salary > 30000;

        double salary = 45000;

        System.out.println(
            highSalary.test(salary)
            ? "Employee has high salary"
            : "Employee salary is low"
        );
    }
}