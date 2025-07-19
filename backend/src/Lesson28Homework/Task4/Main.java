package Lesson28Homework.Task4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[5];

        System.out.println("5 hərf daxil edin:");
        for (int i = 0; i < 5; i++) {
            letters[i] = sc.next().charAt(0);
        }

        String result = String.copyValueOf(letters);
        System.out.println("Nəticə: " + result);
    }
}
