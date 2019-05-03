package week4.Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        if (this.meals.size() > 0) {
            for (String meal : this.meals) {
                System.out.println(meal);
            }
        } else {
            System.out.println("You have no food items in your menu");
        }
    }

    public void clearMenu() {
        if (this.meals.size() > 0) {
            this.meals.clear();
        }
    }
}
