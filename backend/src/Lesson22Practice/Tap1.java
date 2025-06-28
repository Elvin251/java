package Lesson22Practice;

public class Tap1 {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 18, 20, 30, 7};
        for (int num : numbers) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(num);
            }
        }

    }
}
