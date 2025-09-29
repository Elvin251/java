package Lesson39Homework;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[15]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index mövcud deyil!");
        }
    }
}
