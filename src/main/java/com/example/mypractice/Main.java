package com.example.mypractice;

public class Main {
    public static void main(String[] args) {

        Food food1 = new Food("pizza",50,10.99,10);
        Food food2 = new Food("burger",60,5.25,20);

        System.out.println(food1.toString());
        System.out.println(food2.toString());
    }
}
