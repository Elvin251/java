package Lesson16Homework.Task12;

public class Task12 {
    public static String longerString(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else {
            return s2;
        }
    }

    public static void main(String[] args) {
        System.out.println(longerString("Salam", "Necesen"));
    }
}
