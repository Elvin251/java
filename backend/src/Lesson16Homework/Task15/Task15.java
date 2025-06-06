package Lesson16Homework.Task15;

public class Task15 {
    public static int sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenNumbers(10));
    }
}
