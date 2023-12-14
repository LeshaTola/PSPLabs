package Sixth.SecondPart;

import java.io.Serializable;

public class Food implements Serializable {

    private String name;
    private int calories;
    private int fat;
    private int protein;
    private int carbohydrates;

    private String deliveryDate;

    @Override
    public String toString() {
        return "Food [name=" + name + ", calories=" + calories + ", fat=" + fat + ", protein=" + protein
                + ", carbohydrates=" + carbohydrates + ", deliveryDate=" + deliveryDate + "]";
    }

    public Food() {
    }

    public Food(String name, int calories, int fat, int protein, int carbohydrates, String deliveryDate) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.deliveryDate = deliveryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
