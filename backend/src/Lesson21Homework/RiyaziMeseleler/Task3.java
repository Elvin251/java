package Lesson21Homework.RiyaziMeseleler;

public class Task3 {
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + factorial(n));
    }
}
