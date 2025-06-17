package Lesson18Homework.Task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Leyla Əliyeva", false);
        LibraryBook book = new LibraryBook("Əli və Nino", "Qurban Səid", "Roman");

        String borrowDate = "2025-06-17";
        LibrarySystem.registerBorrow(student, book, borrowDate);
    }
}
