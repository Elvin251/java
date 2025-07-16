package Lesson27Practice.Task3;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Clean Code");
        Book b3 = new Book("Effective Java", "Joshua Bloch");
        Book b4 = new Book("Java Basics", "Author A", 350);

        b2.printTitle();
        b3.printAuthor();
        b4.defaultMethod();
        b4.display("Bestseller");

        System.out.println("Book count: " + Book.bookCount);
    }
}
