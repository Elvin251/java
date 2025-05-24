package Lesson13Practice;

public class Task2tekrar {
    public static void main(String[] args) {
        System.out.println("1-dən 100-ə qədər 3-3 artan və 6-ya bölünən ədədlər:");

        for (int i = 3; i <= 100; i += 3) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
