package Yaytapsiriqlari.Task4.Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil et: ");
        double a = sc.nextDouble();
        System.out.print("İkinci ədədi daxil et: ");
        double b = sc.nextDouble();

        System.out.println("Əməliyyat seçin: (+, -, *, /, %, ^)");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Cavab: " + (a + b));
                break;
            case '-':
                System.out.println("Cavab: " + (a - b));
                break;
            case '*':
                System.out.println("Cavab: " + (a * b));
                break;
            case '/':
                if (b != 0) System.out.println("Cavab: " + (a / b));
                else System.out.println("0-a bölmək olmaz!");
                break;
            case '%':
                System.out.println("Cavab: " + (a % b));
                break;
            case '^':
                System.out.println("Cavab: " + Math.pow(a, b));
                break;
            default:
                System.out.println("Yanlış seçim!");
        }
    }
}
