package com.example.mypractice;

public class Food {

    private String name;
    private int calories;
    private double price;
    private int protein;

    public Food(String name, int calories, double price, int protein) {
        setName(name);
        setCalories(calories);
        setPrice(price);
        setProtein(protein);
    }


    public void setName(String name) {
        if(name.length()<2 || name.trim().isEmpty())
            throw new IllegalArgumentException(name + "must have 2 characters and should not be having blank spaces.");
        else
            this.name = name;

    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if(calories<0 || calories>2000)
            throw new IllegalArgumentException(calories + "must be in range 0 and 2000");
        else
            this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0 || price>150)
            throw new IllegalArgumentException(price+"must be in range 0 to 150.");
        else
            this.price = price;
    }

    public void setProtein(int protein) {
        if(protein<0 || protein>100)
            throw new IllegalArgumentException(protein+"must be in range 0 to 100.");
        else
            this.protein = protein;
    }

    public String toString(){
        return name + " $ " + price;
    }
}
