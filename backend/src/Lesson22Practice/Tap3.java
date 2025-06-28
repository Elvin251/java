package Lesson22Practice;

public class Tap3 {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 19, 3};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Ən kiçik: " + min);
        System.out.println("Ən böyük: " + max);

    }
}
