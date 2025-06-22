package Lesson20Homework.Stuasiya;

public class Order {
   Food food;
int quantity;
Address address;
 Customer customer;
Status status;

    public Order(Food food, int quantity, Address address, Customer customer, Status status) {
        this.food = food;
        this.quantity = quantity;
        this.address = address;
        this.customer = customer;
        this.status = status;
    }

    public double calculateTotal() {
        return food.getPrice() * quantity;
    }

    public void printOrderInfo() {
        System.out.println("Sifariş məlumatları:");
        food.printFoodInfo();
        System.out.println("Miqdar: " + quantity);
        System.out.println("Ümumi məbləğ: " + calculateTotal() + " ₼");
        System.out.println("Müştəri: " + customer.getFullName() + " | Telefon: " + customer.getPhone());
        System.out.println("Ünvan: " + address.city() + ", " + address.country() + " | " + address.address());
        System.out.println("Status: " + status);
    }
}
