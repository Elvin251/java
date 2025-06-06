package Lesson16Homework.Task5;

public class Task5 {
    public static boolean isEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEqual("salam", "salam")); // true
        System.out.println(isEqual("salam", "hello")); // false
    }
}
