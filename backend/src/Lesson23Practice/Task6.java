package Lesson23Practice;

public class Task6 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 8, 3, 7, 9};
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        double avg = (double) sum / nums.length;

        System.out.println("Ortalama: " + avg);
        System.out.print("Ortamadan böyük ədədlər: ");
        for (int n : nums) {
            if (n > avg)
                System.out.print(n + " ");
        }
    }
}
