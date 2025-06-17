package Lesson18Homework.Task2;

public class LibrarySystem {
    public static void registerBorrow(Student student, LibraryBook book, String date) {
        if (student.isEligible()) {
            System.out.println(student.name + " kitab götürdü:");
            book.displayInfo();
            System.out.println("Tarix: " + date);
        } else {
            System.out.println(student.name + " əvvəlki borcunu ödəməyib. Kitab verilmir.");
        }
    }
}
