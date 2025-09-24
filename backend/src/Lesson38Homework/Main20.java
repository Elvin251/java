package Lesson38Homework;

public class Main20 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        System.out.println("Program continues...");
    }
}

