package com.inheritance.hybrid.restaurant;

public class Chef extends Person implements Worker {

    private String speciality;

    public Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing food.");
        System.out.println("Speciality: " + speciality);
    }
}
