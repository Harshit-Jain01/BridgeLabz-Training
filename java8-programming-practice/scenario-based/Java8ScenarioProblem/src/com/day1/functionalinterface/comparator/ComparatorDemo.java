package com.day1.functionalinterface.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int rank;

    Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String toString() {
        return name + " - Rank: " + rank;
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - Salary: " + salary;
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - Price: " + price;
    }
}

class BankAccount {
    String accountNo;
    double balance;

    BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String toString() {
        return accountNo + " - Balance: " + balance;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        // 1. Compare students by rank
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 3));
        students.add(new Student("Amit", 1));
        students.add(new Student("Sneha", 2));

        students.sort(Comparator.comparingInt(s -> s.rank));
        System.out.println("Students sorted by Rank:");
        students.forEach(System.out::println);

        // 2. Compare employees by salary
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Riya", 75000));
        employees.add(new Employee("Arun", 60000));

        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nEmployees sorted by Salary:");
        employees.forEach(System.out::println);

        // 3. Compare products by price
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 55000));
        products.add(new Product("Mobile", 20000));
        products.add(new Product("Tablet", 30000));

        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("\nProducts sorted by Price:");
        products.forEach(System.out::println);

        // 4. Compare strings by length
        List<String> names = List.of("Java", "SpringBoot", "API", "Microservices");

        names.stream()
             .sorted(Comparator.comparingInt(String::length))
             .forEach(s -> System.out.println("String: " + s + " Length: " + s.length()));

        // 5. Compare bank accounts by balance
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("ACC101", 25000));
        accounts.add(new BankAccount("ACC102", 50000));
        accounts.add(new BankAccount("ACC103", 15000));

        accounts.sort(Comparator.comparingDouble(a -> a.balance));
        System.out.println("\nBank Accounts sorted by Balance:");
        accounts.forEach(System.out::println);
    }
}
