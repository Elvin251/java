package Lesson22Practice;

public class Tap7 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8, 11, 14};
        int oddSum = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                oddSum += n;
            }
        }
        System.out.println("Tək ədədlərin cəmi: " + oddSum);

    }


}
