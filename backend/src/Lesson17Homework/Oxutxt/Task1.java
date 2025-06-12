package Lesson17Homework.Oxutxt;

public class Task1 {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Ədəd müsbət olmalıdır!");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Faktorial(" + number + ") = " + factorial(number));
    }
}
