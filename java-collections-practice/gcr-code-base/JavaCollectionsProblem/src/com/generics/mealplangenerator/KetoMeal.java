package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return 700;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: Avocado, Cheese, Nuts");
    }
}
