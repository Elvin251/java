package Lesson29Practice.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci setri daxil et: ");
        String s1 = sc.nextLine();

        System.out.print("Ikinci setri daxil et: ");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Setirler beraberdir.");
        } else {
            System.out.println("Setirler ferqlidir.");
        }
    }
}
