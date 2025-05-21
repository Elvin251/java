package Lesson12Homework;

public class Phone {
    String brand;
    String model;
    double price;
    int storage;
    String color;

    public Phone(String brand, String model, double price, int storage, String color) {
        if (price <= 0) {
            System.out.println("Invalid price");
        }

        if (storage > 512) {
            System.out.println("High Storage");
        }

        this.brand = (brand == null || brand.isEmpty()) ? "No Brand" : brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Phone -> Brand: " + brand + ", Model: " + model + ", Price: " + price +
                ", Storage: " + storage + "GB, Color: " + color);
    }
}
