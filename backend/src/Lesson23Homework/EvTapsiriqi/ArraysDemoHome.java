package Lesson23Homework.EvTapsiriqi;

public class ArraysDemoHome {
    public static void main(String[] args) {

        int[] numbers = {17, 8, 3, 25};


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Massivin cəmi (for): " + sum);


        System.out.print("Massivin dəyərləri (foreach): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        double average = (double) sum / numbers.length;
        System.out.println("Ədədi orta: " + average);


        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Ən kiçik element: " + min);


        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Ən böyük element: " + max);


        System.out.print("Tək ədədlər: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Cüt ədədlər: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Sadə ədədlər: ");
        for (int i = 0; i < numbers.length; i++) {
            boolean sade = true;
            if (numbers[i] <= 1) {
                sade = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                    if (numbers[i] % j == 0) {
                        sade = false;
                        break;
                    }
                }
            }
            if (sade) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Azalan sırada massiv: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
