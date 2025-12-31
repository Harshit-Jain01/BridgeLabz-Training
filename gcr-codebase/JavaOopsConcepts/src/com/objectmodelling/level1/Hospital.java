package com.objectmodelling.level1;

public class Hospital {

    private Doctor[] doctors=new Doctor[10];
    private Patient[] patients=new Patient[10];

    private int doctorCount=0;
    private int patientCount=0;

    public void addDoctor(Doctor d) {
        doctors[doctorCount++]=d;
    }

    public void addPatient(Patient p) {
        patients[patientCount++]=p;
    }

    public void startConsultation(int doctorIndex, int patientIndex) {
        doctors[doctorIndex].consult(patients[patientIndex]);
    }
}
