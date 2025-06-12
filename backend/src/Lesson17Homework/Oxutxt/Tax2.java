package Lesson17Homework.Oxutxt;

public class Tax2 {
    public static int sumUpTo(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n 1 və ya daha böyük olmalıdır.");
        } else if (n == 1) {
            return 1;
        } else {
            return n + sumUpTo(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("1-dən " + n + "-ə qədər cəm: " + sumUpTo(n));
    }
}
