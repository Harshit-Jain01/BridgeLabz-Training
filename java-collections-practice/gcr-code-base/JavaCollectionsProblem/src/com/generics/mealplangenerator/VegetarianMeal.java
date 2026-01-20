package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return 600;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: Rice, Dal, Vegetables");
    }
}
