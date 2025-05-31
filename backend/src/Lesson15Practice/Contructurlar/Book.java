package Lesson15Practice.Contructurlar;

public class Book {

    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;  // default qiymət
    }


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayInfo();


        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        book2.displayInfo();


        Book book3 = new Book("1984", "George Orwell", 15.99);
        book3.displayInfo();
    }
}
