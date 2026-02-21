package Lesson79;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {5, -2, 0, -7, 12, -1, 9};

        int count = 0;
        for (int x : arr) {
            if (x < 0) {
                count++;
            }
        }

        System.out.println("Menfi ededlerin sayi: " + count);
    }
}