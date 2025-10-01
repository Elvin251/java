package Lesson40Practice.Evisi2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Nəticə: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Xəta: 0-a bölmək olmaz!");
        }
    }
}

