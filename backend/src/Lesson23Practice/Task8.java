package Lesson23Practice;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 1, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Axtarılacaq ədədi daxil et: ");
        int target = sc.nextInt();

        boolean tapildi = false;
        for (int n : arr) {
            if (n == target) {
                tapildi = true;
                break;
            }
        }

        if (tapildi)
            System.out.println("Ədəd massivdə mövcuddur.");
        else
            System.out.println("Ədəd massivdə yoxdur.");
    }
}
