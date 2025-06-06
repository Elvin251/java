package Lesson16Homework.Task3;

public class Task3 {
    public static int mutleq(int n) {
        return n < 0 ? -n : n;
    }

    public static void main(String[] args) {
        System.out.println("Mütləq: " + mutleq(-9)); // 9
    }
}
