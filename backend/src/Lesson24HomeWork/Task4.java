package Lesson24HomeWork;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Arrays.fill(numbers, 999);
        System.out.println(Arrays.toString(numbers));
    }
}
