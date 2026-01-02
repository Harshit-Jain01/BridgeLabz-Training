package com.day1.hospitalmanagement;


public abstract class Patient {

    protected int patientId;
    protected String name;
    protected int age;
    private String medicalHistory;   // sensitive data

    // Normal admission
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission (overloaded constructor)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public abstract void displayInfo();

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}
