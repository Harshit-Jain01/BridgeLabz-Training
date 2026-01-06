package com.day4.fittrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength",duration);
    }

    @Override
    void calculateCalories() {
        caloriesBurned=duration*5;
    }
}
