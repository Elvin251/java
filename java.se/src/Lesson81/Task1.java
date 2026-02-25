package Lesson81;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 0, 7, 2};
        int target = 6;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }

            }
        }

    }
}