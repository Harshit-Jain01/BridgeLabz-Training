package com.encapsulation.hospital;


public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters (no direct setters for sensitive data)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setMedicalDetails(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }

    protected String getMedicalDetails() {
        return "Diagnosis: " + diagnosis + ", History: " + medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
