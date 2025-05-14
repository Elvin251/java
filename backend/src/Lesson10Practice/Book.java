package Lesson10Practice;

public class Book {
    String name;
    String author;
    int year;
    int pageCount;

    @Override
    public String toString() {
        return "Book{name='" + name + "', author='" + author +
                "', year=" + year + ", pageCount=" + pageCount + "}";
    }
}
