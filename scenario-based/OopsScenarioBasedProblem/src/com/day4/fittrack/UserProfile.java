package com.day4.fittrack;

class UserProfile {
    String name;
    int age;
    private double weight;  
    String goal;
    int dailyCalorieTarget;

    // Default constructor
    public UserProfile(String name,int age,double weight) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.goal="Maintain Fitness";
        this.dailyCalorieTarget=2000;
    }

    // Custom constructor
    public UserProfile(String name,int age,double weight,String goal,int target) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.goal=goal;
        this.dailyCalorieTarget=target;
    }

    public double getWeight() {
        return weight;
    }
}
