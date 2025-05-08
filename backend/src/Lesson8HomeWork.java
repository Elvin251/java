import java.util.Scanner;

public class Lesson8HomeWork {
    public static void main(String[] args) {

//        homework1
//        ev isi-1
        // 1.
        int intValue = 55;
        byte byteFromInt = (byte) intValue;
        System.out.println("int (55) to byte: " + byteFromInt);

        // 2.
        short shortValue = 636;
        byte byteFromShort = (byte) shortValue;
        System.out.println("short (636) to byte: " + byteFromShort);

        // 3.
        long longValue1 = 458L;
        short shortFromLong = (short) longValue1;
        System.out.println("long (458) to short: " + shortFromLong);

        // 4.
        long longValue2 = 92523635483L;
        int intFromLong = (int) longValue2;
        System.out.println("long (92523635483) to int: " + intFromLong);

        // 5.
        double doubleValue = 65787.3;
        int intFromDouble = (int) doubleValue;
        System.out.println("double (65787.3) to int: " + intFromDouble);

        // 6.
        char charValue = 'q';
        int intFromChar = (int) charValue;
        System.out.println("char ('q') to int: " + intFromChar);

        // 7.
        int intValue2 = 266;
        char charFromInt = (char) intValue2;
        System.out.println("int (266) to char: " + charFromInt);
//        ev isi-2
//        1.
        for (int i = 15; i <= 40; i++) {
            System.out.println(i);
        }
//        2.
        for (int i = 21; i < 50; i += 2) {
            System.out.println(i);
        }
//        ders-praktikasi-3 ilk 2-si
//        1.
        for (int i = 50; i >= 20; i--) {
            System.out.println(i);
        }
//        2.
        for (double i = 0; i <= 5; i += 0.1) {
            System.out.println( i);
        }
//        Homework2
        // 1)
        System.out.println("1) 1-dən 10-a qədər:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2)
        System.out.println("2) 1-dən 100-ə qədər cüt ədədlər:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 3)
        System.out.println("3) 1-dən 50-yə qədər tək ədədlər:");
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 4)
        int N = 10;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("4) 1-dən " + N + "-ə qədər cəm: " + sum + "\n");

        // 5)
        System.out.println("5) 1-dən 10-a qədər kvadratlar:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "^2 = " + (i * i));
        }
        System.out.println();

        // 6)
        System.out.println("6) 1-dən 50-yə qədər 3-ə bölünənlər:");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 7)
        System.out.println("7) 5 və 7-yə bölünən ədədlər (Xüsusi Ədəd):");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " - Xüsusi Ədəd");
            }
        }
        System.out.println();

        // 8)
        int M = 10, N2 = 30;
        System.out.println("8) " + M + " ilə " + N2 + " arasındakı tək ədədlər:");
        for (int i = M; i <= N2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 9)
        System.out.println("9) 1-dən 20-yə qədər yoxla:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Cüt");
            } else if (i % 3 == 0) {
                System.out.println(i + " - 3-ə bölünür");
            }
        }
        System.out.println();

        // 10)
        System.out.println("10) FizzBuzz:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Buzz");
            }
        }
        System.out.println();

        // 11)
        System.out.println("11) 1-dən 100-ə qədər sadə ədədlər:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
