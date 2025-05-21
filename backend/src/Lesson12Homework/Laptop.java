package Lesson12Homework;

public class Laptop {
    String brand;
    String model;
    double price;
    int RAM;
    String CPU;

    public Laptop(String brand, String model, double price, int RAM, String CPU) {
        if (RAM < 4) {
            System.out.println("Low RAM");
        }

        if (price > 1000) {
            System.out.println("Expensive Laptop");
        }

        if ((brand == null || brand.isEmpty()) && (model == null || model.isEmpty())) {
            this.brand = "Unknown Laptop";
            this.model = "";
        } else {
            this.brand = brand;
            this.model = model;
        }

        this.price = price;
        this.RAM = RAM;
        this.CPU = CPU;
    }

    public void printInfo() {
        System.out.println("Laptop -> Brand: " + brand + ", Model: " + model +
                ", Price: " + price + ", RAM: " + RAM + "GB, CPU: " + CPU);
    }
}
