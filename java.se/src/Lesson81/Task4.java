package Lesson81;

public class Task4 {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(findMissingNumber(arr));
    }
}
