package Lesson22Homework;
public class Book {
    String title;
    int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }
}

class BookMain {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java", 300),
                new Book("Python", 150),
                new Book("C#", 250),
                new Book("HTML", 180),
                new Book("SQL", 220)
        };

        System.out.println("200 səhifədən çox olan kitablar:");
        for (Book b : books) {
            if (b.pageCount > 200) {
                System.out.println(b.title);
            }
        }
    }
}
