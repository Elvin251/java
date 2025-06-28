package Lesson22Homework;

public class MinMax {
    public static void main(String[] args) {
        double[] arr = {3.5, -2.4, 7.1, 0.0, 5.9};
        double min = arr[0], max = arr[0];
        for (double num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);
    }
}
