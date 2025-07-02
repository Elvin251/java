package Lesson23Practice;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        boolean swapped = true;
        int counter = 1;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < arr.length - counter; i++) {
                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }
            counter++;
        }

        System.out.println("Artan sıraya görə sıralanmış massiv:");
        for (int num : arr) {
            System.out.print(num + ", " );
        }
    }
}
