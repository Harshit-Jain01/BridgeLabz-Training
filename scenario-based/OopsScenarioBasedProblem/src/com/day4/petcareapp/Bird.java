package com.day4.petcareapp;

class Bird extends Pet {

    public Bird(String name,int age) {
        super(name,"Bird",age);
    }

    @Override
    public void feed() {
        decreaseHunger(6);
        increaseMood(3);
    }

    @Override
    public void play() {
        decreaseEnergy(8);
        increaseMood(5);
    }

    @Override
    public void sleep() {
        increaseEnergy(15);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
