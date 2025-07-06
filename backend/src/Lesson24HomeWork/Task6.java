package Lesson24HomeWork;
import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};


        int index = Arrays.binarySearch(arr, 15);
        if (index >= 0) {
            System.out.println("15 tapıldı. İndeks: " + index);
        } else {
            System.out.println("15 tapılmadı.");
        }
    }
}

