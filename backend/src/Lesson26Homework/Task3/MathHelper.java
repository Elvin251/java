package Lesson26Homework.Task3;

public class MathHelper {
    private int square(int x) {
        return x * x;
    }

    public void printSquare(int x) {
        int result = square(x);
        System.out.println(x + " squared is: " + result);
    }
}
