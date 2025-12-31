package com.objectmodelling.level1;

public class UseHospital {

    public static void main(String[] args) {

        // Independent objects
        Doctor d1 = new Doctor("Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Mehta", "Orthopedic");

        Patient p1 = new Patient("Rahul");
        Patient p2 = new Patient("Amit");

        // Hospital only links them
        Hospital hospital = new Hospital();

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Communication (association)
        hospital.startConsultation(0, 0);
        hospital.startConsultation(0, 1);
        hospital.startConsultation(1, 0);
    }
}
