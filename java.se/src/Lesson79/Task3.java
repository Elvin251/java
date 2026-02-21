package Lesson79;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 10, 3, 6};

        int sum = 0;
        for (int x : arr) {
            if (x % 2 != 0) {
                sum += x;
            }
        }

        System.out.println("Tek ededlerin cemi: " + sum);
    }
}