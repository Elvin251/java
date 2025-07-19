package Lesson28Homework.Task7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cümlə daxil edin: ");
        String cumle = sc.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            char ch = cumle.charAt(i);
            System.out.println( ch+" -> " +(int) ch) ;
        }
    }
}
