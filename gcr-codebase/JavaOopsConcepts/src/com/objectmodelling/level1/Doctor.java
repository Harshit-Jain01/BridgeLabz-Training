package com.objectmodelling.level1;

public class Doctor {

    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " (" + specialization + 
                           ") is consulting patient " + patient.getName());
    }
}
