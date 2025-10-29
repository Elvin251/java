package az.developia.demo2.Lesson48Practice.Task2;

import org.springframework.stereotype.Component;

@Component
public class MyBook {

    private int id;
    private String title;
    private double price;

    public MyBook() {
        this.id = 101;
        this.title = "Spring in Action";
        this.price = 39.99;
    }

    public void printInfo() {
        System.out.println("Book ID: " + id);
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
    }
}