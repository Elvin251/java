package Lesson18Homework.Task2;

public class LibraryBook {
    String title;
    String author;
    String subject;

    public LibraryBook(String title, String author, String subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public void displayInfo() {
        System.out.println("Kitab: " + title);
        System.out.println("Müəllif: " + author);
        System.out.println("Mövzu: " + subject);
    }
}
