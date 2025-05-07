import java.util.Scanner;
public class Lesson8Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        praktice1
        // 1.
        short shortVal1 = 69;
        byte byteVal1 = (byte) shortVal1;
        System.out.println("byteVal1: " + byteVal1);

        // 2.
        short shortVal2 = 589;
        byte byteVal2 = (byte) shortVal2;
        System.out.println("byteVal2: " + byteVal2);

        // 3.
        long longVal1 = 458;
        int intVal1 = (int) longVal1;
        System.out.println("intVal1: " + intVal1);

        // 4.
        long longVal2 = 52523635483L;
        int intVal2 = (int) longVal2;
        System.out.println("intVal2: " + intVal2);

        // 5.
        double doubleVal = 5632.6;
        float floatVal = (float) doubleVal;
        System.out.println("floatVal: " + floatVal);

        // 6.
        char charVal = 'D';
        int intFromChar = (int) charVal;
        System.out.println("intFromChar: " + intFromChar);
        // 7.
        int intVal3 = 123;
        char charFromInt = (char) intVal3;
        System.out.println("charFromInt: " + charFromInt);
//        practice2
        // 1.
        System.out.println("1. 1-dən 5-ə qədər ədədlər:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2.
        System.out.println("\n2. İki ədədin cəmi:");
        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();
        System.out.println("Cəm: " + (a + b));

        // 3.
        System.out.println("\n3. İki ədədin hasilini tap:");
        System.out.print("Birinci ədədi daxil edin: ");
        int c = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin: ");
        int d = scanner.nextInt();
        System.out.println("Vurma: " + (c * d));

        // 4
        System.out.println("\n4. Çevrənin uzunluğunu hesabla:");
        System.out.print("Radiusu daxil edin: ");
        double r = scanner.nextDouble();
        double uzunluq = 2 * Math.PI * r;
        System.out.println("Çevrənin uzunluğu: " + uzunluq);

        // 5.

        // 6.
        System.out.println("\n6. Ədəd sadə olub-olmamasını yoxla:");
        System.out.print("Ədədi daxil edin: ");
        int sadeEded = scanner.nextInt();
        boolean sade = true;
        if (sadeEded <= 1) sade = false;
        for (int i = 2; i <= Math.sqrt(sadeEded); i++) {
            if (sadeEded % i == 0) {
                sade = false;
                break;
            }
        }
        System.out.println(sade ? "Ədəd sadədir." : "Ədəd mürəkkəbdir.");

        // 7.
        System.out.println("\n7. 1-dən 100-ə qədər ədədlərin cəmi:");
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println("Cəm: " + total);

        // 8.
        System.out.println("\n8. 1-dən 100-ə qədər 7-yə bölünən ədədlər:");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 9.
        System.out.println("\n9. Ədədin cüt olub-olmamasını yoxla:");
        System.out.print("Ədədi daxil edin: ");
        int cutEded = scanner.nextInt();
        System.out.println((cutEded % 2 == 0) ? "Ədəd cütdür." : "Ədəd təkdir.");

        // 10.
        System.out.println("\n10. 1-dən 200-ə qədər həm 3-ə, həm də 7-yə bölünən ədədlər:");
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 11.

        scanner.close();
    }
}
