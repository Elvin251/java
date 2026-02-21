package Lesson79;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;

        if (n < 0) {
            System.out.println("Menfi eded ucun faktorial yoxdur!");
            return;
        }

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + "! = " + fact);
    }
}