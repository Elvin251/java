package Lesson39Homework;

public class Task4 {
    public static void main(String[] args) {
        String text = "Salam";
        try {
            char c = text.charAt(10);
            System.out.println("Simvol: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Bu index-də simvol mövcud deyil!");
        }
    }
}

