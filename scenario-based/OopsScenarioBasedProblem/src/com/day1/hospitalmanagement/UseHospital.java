package com.day1.hospitalmanagement;


public class UseHospital{

    public static void main(String[] args) {

        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        System.out.println("--------------------");

        Patient p1 = new InPatient(1, "Rahul", 30, 5, 2000);
        p1.displayInfo();

        InPatient ip = (InPatient) p1;
        Bill bill1 = new Bill(ip.getTreatmentCost(), 0.18, 500);

        System.out.println("Total Bill: ₹" + bill1.calculatePayment());

        System.out.println("--------------------");

        Patient p2 = new OutPatient(2, "Amit", 25, 600);
        p2.displayInfo();

        OutPatient op = (OutPatient) p2;
        Bill bill2 = new Bill(op.getTreatmentCost(), 0.05, 100);

        System.out.println("Total Bill: ₹" + bill2.calculatePayment());
    }
}
