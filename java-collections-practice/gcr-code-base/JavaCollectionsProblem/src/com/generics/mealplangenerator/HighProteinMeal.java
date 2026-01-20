package com.generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int getCalories() {
        return 800;
    }

    @Override
    public void displayMeal() {
        System.out.println("High Protein Meal: Chicken, Eggs, Lentils");
    }
}
