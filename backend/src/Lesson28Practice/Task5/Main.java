package Lesson28Practice.Task5;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'D', 'e', 'v', 'e', 'l', 'o', 'p', 'e', 'r'};
        String part = String.copyValueOf(arr, 4, 5);
        System.out.println(part);
    }
}
