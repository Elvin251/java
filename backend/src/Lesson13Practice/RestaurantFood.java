package Lesson13Practice;

public class RestaurantFood {
    String name;
    double price;
    String ingredients;

    public RestaurantFood(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public void displayInfo() {
        System.out.println("Yemək: " + name);
        System.out.println("Qiymət: " + price + " AZN");
        System.out.println("Tərkib: " + ingredients);
    }

}
