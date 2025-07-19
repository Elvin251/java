package Lesson28Homework.Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cümlə daxil edin: ");
        String cumle = sc.nextLine();

        int sozSayi = 0;
        boolean sozBasladi = false;

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (c != ' ') {
                if (!sozBasladi) {
                    sozSayi++;
                    sozBasladi = true;
                }
            } else {
                sozBasladi = false;
            }
        }

        System.out.println("Söz sayı: " + sozSayi);

        if (cumle.length() > 10) {
            System.out.println("Uzun");
        } else {
            System.out.println("Qısa");
        }
    }
}
