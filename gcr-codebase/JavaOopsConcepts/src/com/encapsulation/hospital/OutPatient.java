package com.encapsulation.hospital;


public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee = 500;

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
