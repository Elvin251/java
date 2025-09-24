package Lesson38Homework;

import java.util.ArrayList;

class Book {
    String title, author, isbn;
    Book(String title, String author, String isbn) {
        this.title = title; this.author = author; this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book b) { books.add(b); }
    void removeBook(Book b) { books.remove(b); }
    void showBooks() {
        for (Book b : books)
            System.out.println(b.title + " by " + b.author);
    }
}

 class Main5 {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Java 101", "John Doe", "12345");
        Book b2 = new Book("OOP Concepts", "Jane Smith", "67890");
        lib.addBook(b1); lib.addBook(b2);
        lib.showBooks();
        lib.removeBook(b1);
        System.out.println("After removal:");
        lib.showBooks();
    }
}
