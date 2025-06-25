package Lesson21Practice;
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public void calculateLength(Circle c) {
        c.length = 2 * Math.PI * c.radius;
    }
}
