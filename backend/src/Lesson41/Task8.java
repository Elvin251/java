package Lesson41;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Task8 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Toplama: " + add.operate(5, 3));
        System.out.println("Çıxma: " + subtract.operate(5, 3));
    }
}
