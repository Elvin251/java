package Lesson40Practice.Evisi2;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Ədəd: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Yanlış format: Rəqəm daxil edin!");
        }
    }
}
