package Lesson14;

public class Book {
    String title;

    public Book() {
        this.title = "Unknown";
    }

    public Book(String title) {
        this.title = title;
    }

    public void showTitle() {
        System.out.println("Book: " + title);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.showTitle();

        Book b2 = new Book("Java Programming");
        b2.showTitle();
    }
}
