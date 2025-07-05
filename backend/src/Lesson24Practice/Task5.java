package Lesson24Practice;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = {99, 12, 45, 203, 100, 4125};
        int[] arr2 = {99, 12, 22, 203, 100, 1009};

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Massivlər bərabərdir? " + isEqual);
    }
}
