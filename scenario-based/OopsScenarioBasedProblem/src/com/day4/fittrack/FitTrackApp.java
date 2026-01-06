package com.day4.fittrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user=new UserProfile("Harshit",22,70.5,"Weight Loss",1800);

        Workout w1=new CardioWorkout(30);
        w1.startWorkout();
        w1.calculateCalories();
        w1.stopWorkout();

        Workout w2=new StrengthWorkout(40);
        w2.startWorkout();
        w2.calculateCalories();
        w2.stopWorkout();

        int totalCalories=w1.getCaloriesBurned()+w2.getCaloriesBurned();
        int progress=user.dailyCalorieTarget-totalCalories;

        System.out.println("Calories Burned:"+totalCalories);
        System.out.println("Remaining Target:"+progress);
    }
}
