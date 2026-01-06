package com.day4.petcareapp;

class Dog extends Pet {

    public Dog(String name,int age) {
        super(name,"Dog",age);
    }

    @Override
    public void feed() {
        decreaseHunger(10);
        increaseMood(5);
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseMood(10);
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
