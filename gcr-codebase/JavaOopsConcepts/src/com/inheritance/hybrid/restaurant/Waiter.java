package com.inheritance.hybrid.restaurant;

public class Waiter extends Person implements Worker {

    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}
