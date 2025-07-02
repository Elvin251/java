package Lesson23Practice;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6};
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Ən böyük: " + max);
        System.out.println("Ən kiçik: " + min);
    }
}
