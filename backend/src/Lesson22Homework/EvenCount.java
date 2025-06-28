package Lesson22Homework;

public class EvenCount {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 11, 20, 25};
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }
        System.out.println("Cüt ədədlərin sayı: " + count);
    }
}
