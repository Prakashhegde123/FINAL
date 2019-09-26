package com.example.project;

public class Coffee {
    private String coffeeName;
    private int coffeeImage;
    private String coffeeDescription;

    public Coffee(String coffeeName, int coffeeImage, String coffeeDescription) {
        this.coffeeName = coffeeName;
        this.coffeeImage = coffeeImage;
        this.coffeeDescription = coffeeDescription;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCoffeeImage() {
        return coffeeImage;
    }

    public String getCoffeeDescription() {
        return coffeeDescription;
    }

}
