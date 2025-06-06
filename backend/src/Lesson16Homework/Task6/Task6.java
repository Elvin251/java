package Lesson16Homework.Task6;

public class Task6 {
    public static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Faktorial: " + factorial(5)); // 120
    }
}
