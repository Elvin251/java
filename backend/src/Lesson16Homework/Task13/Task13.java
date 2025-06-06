package Lesson16Homework.Task13;

public class Task13 {
    public static boolean isBetween10And100(int number) {
        if (number >= 10 && number <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isBetween10And100(50));
        System.out.println(isBetween10And100(5));
    }
}
