package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return 550;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: Quinoa, Chickpeas, Salad");
    }
}
