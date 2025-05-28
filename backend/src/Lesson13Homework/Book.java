package Lesson13Homework;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }


    public Book() {
        this.title = "No title";
        this.author = "Unknown";
        this.price = 0.0;
    }
}
