package com.generics.resumescreeningsystem;

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void screenResume() {
        System.out.println("Checking Product Sense, Strategy, Communication");
    }
}
