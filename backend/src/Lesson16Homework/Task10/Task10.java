package Lesson16Homework.Task10;

public class Task10 {
    public static boolean sadeMi(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sadədir? " + sadeMi(7));
    }
}
