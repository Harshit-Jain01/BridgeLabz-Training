package com.encapsulation.hospital;


public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge = 2000;

    public InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis, String history) {
        setMedicalDetails(diagnosis, history);
    }

    @Override
    public void viewRecords() {
        System.out.println(getMedicalDetails());
    }
}
