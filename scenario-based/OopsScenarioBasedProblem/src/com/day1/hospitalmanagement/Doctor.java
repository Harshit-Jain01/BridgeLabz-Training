package com.day1.hospitalmanagement;


public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.doctorId = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
