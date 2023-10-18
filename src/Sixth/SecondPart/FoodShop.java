package Sixth.SecondPart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FoodShop implements Serializable {
    private List<Food> foodList;

    FoodShop() {
        foodList = new ArrayList<Food>();
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void removeFood(int index) {
        foodList.remove(index);
    }

}
