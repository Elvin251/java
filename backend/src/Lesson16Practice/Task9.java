package Lesson16Practice;

public class Task9 {
    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
          return a;
        }
        else if (b > a && b > c) {
            return b;
        }else  {
            return c;
        }
    }
}
