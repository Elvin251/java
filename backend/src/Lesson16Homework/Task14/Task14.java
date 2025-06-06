package Lesson16Homework.Task14;

public class Task14 {
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDivisors(12));
    }
}
