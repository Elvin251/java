package Lesson17Homework;

public class CheackNumber {
    public static String checkNumber(int number) {
        if (number > 0) {
            return "Müsbət";
        } else if (number < 0) {
            return "Mənfi";
        } else {
            return "Sıfır";
        }
    }

}
