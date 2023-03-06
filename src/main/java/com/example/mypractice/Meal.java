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
}
