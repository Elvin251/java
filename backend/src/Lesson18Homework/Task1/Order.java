package Lesson18Homework.Task1;

public class Order {
    RestaurantFood food;
    int quantity;

    public Order(RestaurantFood food, int quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return food.price * quantity;
    }

    public void displayOrder() {
        food.displayInfo();
        System.out.println("Sayı: " + quantity);
        System.out.println("Ümumi məbləğ: " + calculateTotal() + " AZN");
    }
}
