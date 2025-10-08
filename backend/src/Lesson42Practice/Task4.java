package Lesson42Practice;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Task4 {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;


        Calculator subtract = (a, b) -> a - b;

        System.out.println("Toplama: " + add.operate(10, 5));
        System.out.println("Çıxma: " + subtract.operate(10, 5));
    }
}
