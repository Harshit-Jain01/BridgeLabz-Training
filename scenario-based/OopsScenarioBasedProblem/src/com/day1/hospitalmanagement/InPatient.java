package com.day1.hospitalmanagement;


public class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient: " + getSummary());
        System.out.println("Days Admitted: " + daysAdmitted);
    }

    public double getTreatmentCost() {
        return daysAdmitted * dailyCharge;
    }
}
