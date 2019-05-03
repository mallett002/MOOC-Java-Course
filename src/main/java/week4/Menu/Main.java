package week4.Menu;

public class Main {
    public static void main(String... args) {
        Menu menu = new Menu();
        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("SauerKraut");

        menu.printMeals();

        System.out.println("Clearing the menu...");
        menu.clearMenu();

        menu.printMeals();
    }
}
