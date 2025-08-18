package Yaytapsiriqlari.Task2;

    import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {
            // 1)
            System.out.println("1-dən 100-ə qədər cüt ədədlər:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");

            // 2)
            System.out.println("Vurma cədvəli:");
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i + "x" + j + "=" + (i * j) + "\t");
                }
                System.out.println();
            }
            System.out.println();

            // 3)
            System.out.println("1-dən 10-a qədər ədədlərin kvadratları:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "² = " + (i * i));
            }
            System.out.println();

            // 4)
            System.out.println("Ədədlərdən ibarət üçbucaq:");
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();

            // 5)
            System.out.println("1-dən 20-yə qədər ədədlər:");
            int a = 1;
            while (a <= 20) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println("\n");

            // 6)
            Scanner sc = new Scanner(System.in);
            System.out.print("Bir ədəd daxil et: ");
            int num = sc.nextInt();
            int reverse = 0;
            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            System.out.println("Tərs: " + reverse);
            System.out.println();

            // 7)
            int toplam = 0;
            int input;
            do {
                System.out.print("Ədəd daxil et (dayandırmaq üçün 0): ");
                input = sc.nextInt();
                toplam += input;
            } while (input != 0);
            System.out.println("Cəm = " + toplam);
        }
    }

