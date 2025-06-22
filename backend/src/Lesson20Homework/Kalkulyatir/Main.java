package Lesson20Homework.Kalkulyatir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double b = scanner.nextDouble();

        System.out.println("Əməliyyat seçin (+, -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Cəm: " + (a + b));
                break;
            case '-':
                System.out.println("Fərq: " + (a - b));
                break;
            case '*':
                System.out.println("Vurma: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Bölmə: " + (a / b));
                else
                    System.out.println("0-a bölmək olmaz!");
                break;
            case '%':
                System.out.println("Qalıq: " + (a % b));
                break;
            case '^':
                System.out.println("Qüvvət: " + Math.pow(a, b));
                break;
            default:
                System.out.println("Yanlış əməliyyat seçildi.");
        }

        scanner.close();
    }
}
