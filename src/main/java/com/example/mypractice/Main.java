package com.example.mypractice;

public class Main {
    public static void main(String[] args) {

        Food pizza = new Food("pizza",350,10.99,10);
        Food burger = new Food("burger",460,5.25,20);
        Food fries = new Food("fries",270,4.99,30);

        System.out.println(pizza.toString());
        System.out.println(burger.toString());
        System.out.println(fries.toString());

        Meal meal1 = new Meal();

        meal1.addFood(pizza);
        meal1.addFood(burger);
        meal1.addFood(fries);
        meal1.removeFood(pizza);

        System.out.printf("Total calories are :  " + meal1.getCalories());
    }
}
