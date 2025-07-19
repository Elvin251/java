package Lesson28Homework.Task6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cümlə daxil edin: ");
        String cumle = sc.nextLine();
        int say = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a') {
                say++;
            }
        }

        System.out.println("'a' hərfinin sayı: " + say);
    }
}
