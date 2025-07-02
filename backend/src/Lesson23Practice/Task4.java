package Lesson23Practice;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 8, 9, 12};

        System.out.print("Cüt ədədlər: ");
        for (int n : numbers) {
            if (n % 2 == 0)
                System.out.print(n + " ");
        }

        System.out.print("Tək ədədlər: ");
        for (int n : numbers) {
            if (n % 2 != 0)
                System.out.print(n + " ");
        }

    }
}
