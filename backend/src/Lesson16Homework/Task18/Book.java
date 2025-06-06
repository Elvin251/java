package Lesson16Homework.Task18;

public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo() {
        System.out.println("Kitab: " + title);
        System.out.println("Müəllif: " + author);
        System.out.println("Qiymət: " + price + " AZN");
    }

    public static void main(String[] args) {
        Book book = new Book("Əli və Nino", "Qurban Səid", 15.5);
        book.printInfo();
    }
}
