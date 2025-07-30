package Lesson30Practice;
import java.util.Scanner;
public class RiyaziTapsiriqlar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. İkinci idmançı birincini neçə saniyəyə çatacaq?
        System.out.println("1) Vaxt: " + (100 / (8 - 6)) + " saniyə");

        // 2. Qatarlar neçə dəqiqəyə qarşılaşacaq?
        System.out.println("2) Qarşılaşma: " + (100.0 / (40 + 60) * 60) + " dəqiqə");

        // 3. Rəqəm cəmi
        System.out.print("3) Ədəd daxil et: ");
        int eded = sc.nextInt();
        int cem = 0;
        while (eded > 0) {
            cem = cem + eded % 10;
            eded = eded / 10;
        }
        System.out.println("Cəm: " + cem);

        // 4. Ədədi tərsinə çevir
        System.out.print("4) Ədəd daxil et: ");
        int eded2 = sc.nextInt();
        int ters = 0;
        while (eded2 > 0) {
            ters = ters * 10 + eded2 % 10;
            eded2 = eded2 / 10;
        }
        System.out.println("Tərsi: " + ters);

        // 5. Rəqəm sayı
        System.out.print("5) Ədəd daxil et: ");
        int eded3 = sc.nextInt();
        int say = 0;
        do {
            say = say + 1;
            eded3 = eded3 / 10;
        } while (eded3 > 0);
        System.out.println("Rəqəm sayı: " + say);

        // 6. Sadə və ya mürəkkəb
        System.out.print("6) Ədəd daxil et: ");
        int eded4 = sc.nextInt();
        boolean sade = true;
        if (eded4 <= 1) {
            sade = false;
        } else {
            for (int i = 2; i <= eded4 / 2; i++) {
                if (eded4 % i == 0) {
                    sade = true;
                    break;
                }
            }
        }
        if (sade) {
            System.out.println("Sadə ədəddir");
        } else {
            System.out.println("Mürəkkəb ədəddir");
        }

        // 7. Faktorial
        System.out.print("7) Ədəd daxil et: ");
        int eded5 = sc.nextInt();
        int fakt = 1;
        for (int i = 1; i <= eded5; i++) {
            fakt = fakt * i;
        }
        System.out.println("Faktorial: " + fakt);

        // 8. Palindrom
        System.out.print("8) Ədəd daxil et: ");
        int eded6 = sc.nextInt();
        int original = eded6;
        int ters2 = 0;
        while (eded6 > 0) {
            ters2 = ters2 * 10 + eded6 % 10;
            eded6 = eded6 / 10;
        }
        if (original == ters2) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom deyil");
        }

        // 9. Fibonacci
        System.out.print("9) n daxil et: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();

        // 10. Tək və cüt ədədlər
        System.out.print("10) Ədəd daxil et: ");
        int limit = sc.nextInt();
        System.out.print("Cüt ədədlər: ");
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nTək ədədlər: ");
        for (int i = 0; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nTamamlandı.");
    }
    }


