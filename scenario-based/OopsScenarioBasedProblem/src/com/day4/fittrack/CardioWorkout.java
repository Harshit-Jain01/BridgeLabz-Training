package com.day4.fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio",duration);
    }

    @Override
    void calculateCalories() {
        caloriesBurned=duration*8;
    }
}
