package Lesson39Homework;

public class Task2 {
    public static void main(String[] args) {
        String s = "123a";
        try {
            int num = Integer.parseInt(s);
            System.out.println("Ədəd: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Sətir ədədə çevrilə bilmədi!");
        }
    }
}
