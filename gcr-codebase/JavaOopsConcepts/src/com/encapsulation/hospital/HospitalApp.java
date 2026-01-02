package com.encapsulation.hospital;


public class HospitalApp {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Amit Sharma", 45, 5);
        Patient p2 = new OutPatient(102, "Neha Verma", 30);

        processPatient(p1);
        System.out.println("--------------------");
        processPatient(p2);
    }

    // Polymorphism
    public static void processPatient(Patient patient) {

        patient.getPatientDetails();

        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            record.addRecord("General Checkup", "No prior complications");
            record.viewRecords();
        }

        System.out.println("Total Bill: ₹" + patient.calculateBill());
    }
}

