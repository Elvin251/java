package Lesson22Practice;

public class Tap6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Cüt ədədlər:");
        for (int n : nums) {
            if (n % 2 == 0) System.out.print(n + " ");
        }
        System.out.println("\nTək ədədlər:");
        for (int n : nums) {
            if (n % 2 != 0) System.out.print(n + " ");
        }
    }

}
