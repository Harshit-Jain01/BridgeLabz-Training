package com.day4.fittrack;

abstract class Workout implements ITrackable {
    String type;
    int duration; 
    protected int caloriesBurned;

    public Workout(String type,int duration) {
        this.type=type;
        this.duration=duration;
    }

    abstract void calculateCalories();

    @Override
    public void startWorkout() {
        System.out.println(type+" workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type+" workout stopped");
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
