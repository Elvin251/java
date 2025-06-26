package Lesson21Homework.RiyaziMeseleler;

public class Task2 {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int test = 121;
        System.out.println(test + " palindromdur? " + isPalindrome(test));
    }
}
