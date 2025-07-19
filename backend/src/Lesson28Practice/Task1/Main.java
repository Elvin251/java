package Lesson28Practice.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cümlə daxil edin: ");
        String sentence = sc.nextLine();

        System.out.println("Simvol sayı: " + sentence.length());
    }
}