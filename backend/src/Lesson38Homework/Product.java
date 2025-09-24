package Lesson38Homework;

import java.util.ArrayList;

class Product {
    String name; double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    void removeProduct(Product p) { products.remove(p); }
    double getTotalPrice() {
        double total = 0;
        for (Product p : products) total += p.price;
        return total;
    }
}

 class Main12 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Phone", 800));
        cart.addProduct(new Product("Case", 20));
        System.out.println("Total: " + cart.getTotalPrice());
    }
}
