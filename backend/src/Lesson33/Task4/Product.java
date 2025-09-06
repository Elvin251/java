package Lesson33.Task4;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Qiymət mənfi ola bilməz!");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Məhsul: " + name + ", Qiymət: " + price);
    }
}
