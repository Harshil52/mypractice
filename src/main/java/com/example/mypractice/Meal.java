package com.example.mypractice;

import java.util.ArrayList;

public class Meal {

    private ArrayList<Food> meal;

    public Meal() {
        meal = new ArrayList<>();
    }



    public void addFood(Food food) {
        meal.add(food);
    }
    public void removeFood(Food food){
        meal.remove(food);
    }

    public int getCalories(){
        int totalCalories=0;
        for (Food food: meal)
            totalCalories = totalCalories + food.getCalories();
        return totalCalories;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Food food:meal)
            totalPrice = totalPrice + food.getPrice();
        return totalPrice;
    }

    public int getProtein(){
        int totalProtein = 0;
        for (Food food:meal)
            totalProtein = totalProtein + food.getProtein();
        return totalProtein;
    }
}
