package com.objectmodelling.level1;

public class Patient {

    private String name;

    public Patient(String name) {
        this.name = name;
        System.out.println(name + " registered successfully");
    }

    public String getName() {
        return name;
    }
}
