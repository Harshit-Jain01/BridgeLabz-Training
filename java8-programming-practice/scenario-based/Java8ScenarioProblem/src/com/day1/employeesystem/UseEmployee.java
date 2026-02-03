package com.day1.employeesystem;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class UseEmployee {

    public static void main(String[] args) {

        // Creating employee list
        List<Employee> employees = new ArrayList<>();

        // Adding employee objects
        employees.add(new Employee("E01", "Amit", "IT", "Male", 25, 2021, 4500));
        employees.add(new Employee("E02", "Neha", "HR", "Female", 28, 2020, 40000));
        employees.add(new Employee("E03", "Rahul", "Finance", "Male", 30, 2019, 55000));
        employees.add(new Employee("E04", "Pooja", "Sales", "Female", 26, 2022, 48000));
        employees.add(new Employee("E05", "Suresh", "Admin", "Male", 35, 2018, 60000));
        employees.add(new Employee("E06", "Kiran", "HR", "Male", 29, 2020, 42000));
        employees.add(new Employee("E07", "Anjali", "Finance", "Female", 27, 2021, 50000));
        employees.add(new Employee("E08", "Vikas", "IT", "Male", 32, 2011, 65000));
        employees.add(new Employee("E09", "Sneha", "Admin", "Female", 24, 2023, 38000));
        employees.add(new Employee("E10", "Rohit", "IT", "Male", 31, 2014, 58000));
        employees.add(new Employee("E11", "Shruti", "Sales", "Female", 24, 2023, 38000));
        employees.add(new Employee("E12", "Harshit", "IT", "Male", 31, 2014, 58000));
        employees.add(new Employee("E13", "Samyak", "Sales", "Male", 31, 2014, 58000));

        // Count male and female employees
        System.out.println("male and female employees");
        long male = employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("male"))
                .count();
        long female = employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("female"))
                .count();
        System.out.println("Male:" + male + " female:" + female);

        // Print names of all departments
        System.out.println("\nname of all departments");
        employees.stream()
                .map(x -> x.dept)
                .forEach(System.out::println);

        // Calculate average age of male and female employees
        System.out.println("\naverage age of male and female employees");
        employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("male"))
                .mapToInt(m -> m.age)
                .average()
                .ifPresent(x -> System.out.println("Male average age is: " + x));

        employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("female"))
                .mapToInt(m -> m.age)
                .average()
                .ifPresent(x -> System.out.println("Female average age is: " + x));

        // Print highest salary value
        System.out.println("\nhighest paid employee");
        employees.stream()
                .mapToDouble(x -> x.salary)
                .max()
                .ifPresent(System.out::println);

        // Print employees who joined after 2015
        System.out.println("\nall employees who have joined after 2015");
        employees.stream()
                .filter(x -> x.year > 2015)
                .map(x -> x.name)
                .forEach(System.out::println);

        // Number of employees in each department (heading only)
        System.out.println("\nnumber of employees in each department");
        employees.stream().map(x->x.dept).distinct().forEach(x->
        {
        	System.out.print("Department "+x);
        	long count=employees.stream().filter(p->p.dept.equalsIgnoreCase(x)).count();
        	System.out.print(count+"\n");	
        });

        // Average salary of each department 
        System.out.println("\naverage salary of each department");
        employees.stream().map(x->x.dept).distinct().forEach(x->
        {
        	System.out.println("Department "+x);
        	OptionalDouble avg=employees.stream().filter(s->s.dept.equalsIgnoreCase(x)).mapToDouble(p->p.salary).average();
        	System.out.print(avg+"\n");	
        });

        // Find youngest male employee
        System.out.println("\nyoungest male employee");
        employees.stream()
                .filter(e -> e.gender.equalsIgnoreCase("male"))
                .min((e1, e2) -> Integer.compare(e1.age, e2.age))
                .ifPresent(System.out::println);

        // Find employee with most working experience
        System.out.println("\nmost working experience");
        employees.stream()
                .max(Comparator.comparingInt(e -> Year.now().getValue() - e.year))
                .ifPresent(System.out::println);

        // Count male and female employees in Sales department
        System.out.println("\nmale and female employees in the Sales team");
        long malesinSales = employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("male") && x.dept.equalsIgnoreCase("sales"))
                .count();
        long femalesinSales = employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("female") && x.dept.equalsIgnoreCase("sales"))
                .count();
        System.out.println("male:" + malesinSales + "\nfemale:" + femalesinSales);

        // Calculate average salary of male and female employees
        System.out.println("\naverage salary of male and female employees");
        employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("male"))
                .mapToDouble(x -> x.salary)
                .average()
                .ifPresent(x -> System.out.println("Male:" + x));

        employees.stream()
                .filter(x -> x.gender.equalsIgnoreCase("female"))
                .mapToDouble(x -> x.salary)
                .average()
                .ifPresent(x -> System.out.println("Female:" + x));

        // Print employee names grouped by department
        System.out.println("\nnames of all employees in each department ");
        employees.stream()
                .map(e -> e.dept)
                .distinct()
                .forEach(d -> {
                    System.out.println(d);
                    employees.stream()
                            .filter(x -> x.dept.equalsIgnoreCase(d))
                            .map(x -> x.name)
                            .forEach(System.out::println);
                    System.out.println("----");
                });

        // Calculate total and average salary of organization
        System.out.println("\naverage salary and total salary of the whole organization");
        System.out.println("Total Salary " + employees.stream().mapToDouble(x -> x.salary).sum());
        System.out.println("Average Salary " + employees.stream().mapToDouble(x -> x.salary).average());

        // Print employees earning more than 25k
        System.out.println("\nemployee whose salary are more than 25k");
        employees.stream()
                .filter(x -> x.salary > 25000)
                .map(n -> n.name)
                .forEach(System.out::println);

        // Print highest paid employee name
        System.out.println("\nhighest paid employee");
        employees.stream()
                .max(Comparator.comparingDouble(a -> a.salary))
                .map(x -> x.name)
                .ifPresent(System.out::println);

        // Print second highest paid employee
        System.out.println("\nthe second highest paid employee");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // Print third highest paid employee
        System.out.println("\nthe third highest paid employee");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

        // Print lowest paid employee
        System.out.println("\nlowest paid employee");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary))
                .findFirst()
                .ifPresent(System.out::println);

        // Print second lowest paid employee
        System.out.println("\nsecond lowest paid employee");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // Print first five lowest paid employees
        System.out.println("\nfirst five lowest paid employee");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary))
                .limit(5)
                .forEach(System.out::println);

        // Print first five highest paid employees
        System.out.println("\nfirst five highest paid employee");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
