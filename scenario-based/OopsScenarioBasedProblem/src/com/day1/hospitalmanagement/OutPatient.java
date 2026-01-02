package com.day1.hospitalmanagement;


public class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient: " + getSummary());
        System.out.println("Consultation Fee: " + consultationFee);
    }

    public double getTreatmentCost() {
        return consultationFee;
    }
}
