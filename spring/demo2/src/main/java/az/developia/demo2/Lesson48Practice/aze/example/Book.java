package az.developia.demo2.Lesson48Practice.aze.example;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private int id;
    private String name;
    private double price;
    private int pageCount;

    public Book() {
        this.id = 1;
        this.name = "The Art of Spring";
        this.price = 29.99;
        this.pageCount = 250;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void printInfo() {
        System.out.println("Book Info:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Page Count: " + pageCount);
    }
}