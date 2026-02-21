package Lesson79;

public class Task4 {
    public static void main(String[] args) {
        int n = 29;

        if (n <= 1) {
            System.out.println(n + " sade deyil");
            return;
        }

        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n + " sadedir (prime)");
        } else {
            System.out.println(n + " sade deyil");
        }
    }
}