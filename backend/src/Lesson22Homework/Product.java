package Lesson22Homework;
public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double total() {
        return price * quantity;
    }
}

 class ProductMain {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Kitab", 10.5, 2),
                new Product("Qələm", 1.2, 10),
                new Product("Defter", 3.0, 5),
                new Product("Silgi", 0.8, 4),
                new Product("Çanta", 25.0, 1)
        };
        double totalSum = 0;
        for (Product p : products) {
            totalSum += p.total();
        }
        System.out.println("Ümumi məbləğ: " + totalSum);
    }
}
