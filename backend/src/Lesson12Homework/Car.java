package Lesson12Homework;

public class Car {
    String brand;
    String model;
    double price;
    int year;
    String color;

    public Car(String brand, String model, double price, int year, String color) {
        if (price < 0) {
            System.out.println("Can not be negative");
        } else if (price > 50000) {
            System.out.println("Very Expensive");
        }

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Car -> Brand: " + brand + ", Model: " + model + ", Price: " + price +
                ", Year: " + year + ", Color: " + color);
    }
}
