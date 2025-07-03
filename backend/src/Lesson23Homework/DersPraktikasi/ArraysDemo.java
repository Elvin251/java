package Lesson23Homework.DersPraktikasi;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = {12, 7, 25, 4, 9};


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Massivin cəmi: " + sum);


        double average = (double) sum / numbers.length;
        System.out.println("Massivin ədədi ortası: " + average);


        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Ən kiçik element: " + min);


        System.out.print("Tək ədədlər: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
