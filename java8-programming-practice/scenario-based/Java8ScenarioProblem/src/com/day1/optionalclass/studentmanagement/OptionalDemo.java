package com.day1.optionalclass.studentmanagement;


import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Rahul",
                null,          
                null,          
                "Bangalore",
                null           
        );

        // 1. Safely fetch student email
        Optional<String> emailOpt = Optional.ofNullable(student.email);
        emailOpt.ifPresentOrElse(
                e -> System.out.println("Email: " + e),
                () -> System.out.println("Email not available")
        );

        // 2. Return default phone number if missing
        String phone = Optional.ofNullable(student.phone)
                .orElse("9999999999");
        System.out.println("Phone: " + phone);

        // 3. Find student by ID
        Optional<Student> studentOpt = findStudentById(student, 102);
        String result = studentOpt
                .map(s -> s.name)
                .orElse("Student not available");
        System.out.println(result);

        // 4. Fetch student address safely
        String address = Optional.ofNullable(student.address)
                .orElse("Address not available");
        System.out.println("Address: " + address);

        // 5. Nickname if present, otherwise real name
        String displayName = Optional.ofNullable(student.nickname)
                .orElse(student.name);
        System.out.println("Display Name: " + displayName);
    }

    // Simulated database lookup
    static Optional<Student> findStudentById(Student student, int id) {
        if (student.id == id) {
            return Optional.of(student);
        }
        return Optional.empty();
    }
}
