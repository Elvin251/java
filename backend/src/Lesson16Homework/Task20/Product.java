package Lesson16Homework.Task20;

public class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }
}
