package Lesson29Homework;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sözü daxil edin: ");
        String str1 = sc.nextLine();
        System.out.print("İkinci sözü daxil edin: ");
        String str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Stringlər eynidir (case-insensitive).");
        } else {
            System.out.println("Stringlər fərqlidir.");
        }
    }
}