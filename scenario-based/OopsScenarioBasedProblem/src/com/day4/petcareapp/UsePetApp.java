package com.day4.petcareapp;

public class UsePetApp {
    public static void main(String[] args) {

        Pet p1=new Dog("Bruno",3);
        Pet p2=new Cat("Kitty",2);
        Pet p3=new Bird("Rio",1);

        p1.makeSound();
        p1.feed();
        p1.play();
        p1.showStatus();

        p2.makeSound();
        p2.sleep();
        p2.showStatus();

        p3.makeSound();
        p3.play();
        p3.showStatus();
    }
}
