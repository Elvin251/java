package Lesson19Practice.Stuasiya1;

public class Product {
String name;
double price;
String description;
String company;
Category category;

    public Product(String name, double price, String description, String company, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.company = company;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

}
