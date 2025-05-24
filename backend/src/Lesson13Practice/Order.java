package Lesson13Practice;

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

    public void showOrder() {
        food.displayInfo();
        System.out.println("Miqdar: " + quantity);
        System.out.println("Cəmi məbləğ: " + calculateTotal() + " AZN");
    }
}
