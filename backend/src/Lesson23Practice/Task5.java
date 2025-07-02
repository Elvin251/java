package Lesson23Practice;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 4, 5, 4};

        boolean[] yoxlanib = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!yoxlanib[i]) {
                int say = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        say++;
                        yoxlanib[j] = true; // təkrar yoxlama
                    }
                }
                System.out.println(arr[i] + " → " + say + " dəfə");
            }
        }
    }
}
