package com.day1.functionalinterface.function;


import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        // 1. Convert student marks into grade (A / B / C)
        Function<Integer, String> marksToGrade = marks -> {
            if (marks >= 80) return "A";
            else if (marks >= 60) return "B";
            else return "C";
        };
        System.out.println("Student Grade: " + marksToGrade.apply(75));

        // 2. Calculate annual salary from monthly salary
        Function<Double, Double> monthlyToAnnualSalary =
                monthlySalary -> monthlySalary * 12;
        System.out.println("Annual Salary: " + monthlyToAnnualSalary.apply(30000.0));

        // 3. Convert product price into discounted price (10% discount)
        Function<Double, Double> discountPrice =
                price -> price - (price * 0.10);
        System.out.println("Discounted Price: " + discountPrice.apply(1000.0));

        // 4. Convert employee name into uppercase
        Function<String, String> nameToUpper =
                name -> name.toUpperCase();
        System.out.println("Employee Name: " + nameToUpper.apply("harshit"));

        // 5. Convert Celsius temperature into Fahrenheit
        Function<Double, Double> celsiusToFahrenheit =
                c -> (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit.apply(30.0));
    }
}
