package com.javastreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Id=" + id +
               ", Name=" + name +
               ", Department=" + department +
               ", Salary=" + salary + "]";
    }
}

public class SerialisationDemo {

    public static void main(String[] args) {

        String fileName = "src/com/javastreams/data.ser";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ravi", "IT", 30000));
        employees.add(new Employee(102, "Sohil", "EC", 45000));
        employees.add(new Employee(103, "Anita", "HR", 40000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            List<Employee> loadedEmployees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nEmployees deserialized:");
            for (Employee emp : loadedEmployees) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
