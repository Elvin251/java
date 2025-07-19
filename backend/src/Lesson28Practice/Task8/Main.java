package Lesson28Practice.Task8;

public class Main {
    public static void main(String[] args) {
        String fileName = "report.pdf";
        if (fileName.endsWith(".pdf")) {
            System.out.println("Fayl .pdf ilə bitir.");
        } else {
            System.out.println("Fayl .pdf ilə bitmir.");
        }
    }
}
