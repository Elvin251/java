package Lesson39Homework;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Nəticə: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0-a bölmə mümkün deyil!");
        }
    }
}
