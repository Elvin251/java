package Lesson27Practice.Task3;

public class Book {
    private String title;
    public String author;
    protected String isbn;
    int pageCount;

    public static int bookCount = 0;

    public Book() {
        bookCount++;
    }

    public Book(String title) {
        this.title = title;
        bookCount++;
    }

    protected Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        bookCount++;
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    private void formatISBN() {
        System.out.println("Formatted ISBN: " + isbn);
    }

    protected void printAuthor() {
        System.out.println("Author: " + author);
    }

    void defaultMethod() {
        System.out.println("Page count: " + pageCount);
    }

    public void display(final String label) {
        System.out.println("Label: " + label);
    }
}
