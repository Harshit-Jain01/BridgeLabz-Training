package com.day1.optionalclass.employeesystem;


import java.util.Optional;

public class OptionalEmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                201,
                "Amit",
                null,               
                "Sharma",
                "amit@gmail.com",
                null,                 
                null,                 
                "Health Insurance"
        );

        // 1. Fetch manager details safely
        String manager = Optional.ofNullable(emp.manager)
                .orElse("Manager not assigned");
        System.out.println("Manager: " + manager);

        // 2. Fetch employee bonus amount (default 0)
        double bonus = Optional.ofNullable(emp.bonus)
                .orElse(0.0);
        System.out.println("Bonus: " + bonus);

        // 3. Find employee by email ID (throw exception if not found)
        Employee foundEmployee = findEmployeeByEmail(emp, "test@gmail.com")
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found with given email"));
        System.out.println("Employee Found: " + foundEmployee.firstName);

        // 4. Get employee insurance details safely
        String insurance = Optional.ofNullable(emp.insurance)
                .orElse("Insurance not available");
        System.out.println("Insurance: " + insurance);

        // 5. Display employee middle name only if present
        Optional.ofNullable(emp.middleName)
                .ifPresent(m -> System.out.println("Middle Name: " + m));
    }

    // Simulated database search
    static Optional<Employee> findEmployeeByEmail(Employee emp, String email) {
        if (emp.email.equals(email)) {
            return Optional.of(emp);
        }
        return Optional.empty();
    }
}
