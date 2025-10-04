package imtahan2.Task18;

import java.util.Scanner;

public class Calcutator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-ci ədədi daxil et: ");
        double a = sc.nextDouble();
        System.out.print("2-ci ədədi daxil et: ");
        double b = sc.nextDouble();
        System.out.print("Əməliyyatı seç (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Nəticə: " + (a + b));
                break;
            case '-':
                System.out.println("Nəticə: " + (a - b));
                break;
            case '*':
                System.out.println("Nəticə: " + (a * b));
                break;
            case '/':
                System.out.println("Nəticə: " + (a / b));
                break;
            default:
                System.out.println("Yanlış əməliyyat!");
        }
    }
}