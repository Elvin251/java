package Lesson18Homework.Task1;

public class Main {
    public static void main(String[] args) {
        RestaurantFood food = new RestaurantFood("Toyuq plov", 8.5, "Toyuq, düyü, kök, ədviyyat");
        Order order = new Order(food, 2);

        order.displayOrder();
        Bank.processPayment("Elvin Məmmədov", order.calculateTotal());
    }
}
