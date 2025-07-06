package Lesson24HomeWork;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 6};

        boolean areEqual = Arrays.equals(a, b);
        System.out.println("Massivlər eynidirmi? " + areEqual);
    }
}
