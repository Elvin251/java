package Lesson79;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Metn daxil edin: ");
        String text = scanner.nextLine().toLowerCase();

        char[] vowels = {'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü'};
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Sait herflerin sayi: " + count);

        scanner.close();
    }
}