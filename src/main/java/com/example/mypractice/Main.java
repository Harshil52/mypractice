package com.example.mypractice;

public class Main {
    public static void main(String[] args) {

        Food pizza = new Food("pizza",50,10.99,10);
        Food burger = new Food("burger",60,5.25,20);

        System.out.println(pizza.toString());
        System.out.println(burger.toString());

        Meal meal = new Meal();

        meal.addFood(pizza);
        meal.addFood(burger);

        meal.removeFood(burger);

    }
}
