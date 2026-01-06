package com.day4.petcareapp;

class Cat extends Pet {

    public Cat(String name,int age) {
        super(name,"Cat",age);
    }

    @Override
    public void feed() {
        decreaseHunger(8);
        increaseMood(4);
    }

    @Override
    public void play() {
        decreaseEnergy(10);
        increaseMood(6);
    }

    @Override
    public void sleep() {
        increaseEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
