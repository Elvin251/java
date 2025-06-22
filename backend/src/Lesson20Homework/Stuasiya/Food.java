package Lesson20Homework.Stuasiya;

public class Food {
    String name;
 String description;
double price;

    public Food(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void printFoodInfo() {
        System.out.println(name + " - " + description + " | Qiymət: " + price + " ₼");
    }
}
