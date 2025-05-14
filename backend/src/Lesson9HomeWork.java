import java.util.Scanner;
public class Lesson9HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1)
        System.out.println("1-dən 100-ə qədər cüt ədədlər:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 2)
        System.out.println("10-a qədər vurma cədvəli:");
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
            System.out.println(i + "^2 = " + (i * i));
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
        System.out.println("1-dən 20-yə qədər ədədlər (while ilə):");
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // 6)
        System.out.print("Ədəd daxil et (tərsini tapmaq üçün): ");
        int number = sc.nextInt();
        int reversed = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(original + " ədədinin tərsi: " + reversed);
        System.out.println();

        // 7)
        int sum = 0;
        int input;
        do {
            System.out.print("Ədəd daxil et (0 daxil etdikdə bitəcək): ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0);
        System.out.println("Daxil edilən ədədlərin cəmi: " + sum);
    }
}
