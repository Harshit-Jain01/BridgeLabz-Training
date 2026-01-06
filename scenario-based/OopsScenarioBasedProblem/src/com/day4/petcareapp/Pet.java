package com.day4.petcareapp;

abstract class Pet implements IInteractable {
    String name;
    String type;
    int age;

    private int hunger;
    private int energy;
    private int mood;

    // Random default values
    public Pet(String name,String type,int age) {
        this.name=name;
        this.type=type;
        this.age=age;
        this.hunger=(int)(Math.random()*50+30);
        this.energy=(int)(Math.random()*50+30);
        this.mood=50;
    }

    
    public Pet(String name,String type,int age,int hunger,int energy,int mood) {
        this.name=name;
        this.type=type;
        this.age=age;
        this.hunger=hunger;
        this.energy=energy;
        this.mood=mood;
    }

    protected void increaseEnergy(int value) {
        energy+=value;
    }

    protected void decreaseEnergy(int value) {
        energy-=value;
    }

    protected void increaseMood(int value) {
        mood+=value;
    }

    protected void decreaseHunger(int value) {
        hunger-=value;
    }

    public abstract void makeSound();

    public void showStatus() {
        System.out.println(name+" | Hunger:"+hunger+" Energy:"+energy+" Mood:"+mood);
    }
}
