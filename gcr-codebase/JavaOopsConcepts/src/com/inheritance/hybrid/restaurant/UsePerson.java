package com.inheritance.hybrid.restaurant;

public class UsePerson{

    public static void main(String[] args) {

        Worker chef = new Chef("Ramesh", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Amit", 102, 5);

        System.out.println("Chef Duties:");
        chef.performDuties();
   
        System.out.println("----------------");

        System.out.println("Waiter Duties:");
        waiter.performDuties();
    }
}
