package Lesson12Homework;

public class Book {
    String title;
    String author;
    int pages;
    String genre;

    public Book(String title, String author, int pages, String genre) {
        if ((title == null || title.isEmpty()) && (author == null || author.isEmpty())) {
            this.title = "Unknown Book";
            this.author = "";
        } else {
            this.title = title;
            this.author = author;
        }

        if (pages <= 0) {
            System.out.println("Invalid page number");
        }

        this.pages = pages;
        this.genre = genre;
    }

    public void printInfo() {
        System.out.println("Book -> Title: " + title + ", Author: " + author +
                ", Pages: " + pages + ", Genre: " + genre);
    }

}
