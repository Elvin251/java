package Lesson24Practice;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] data = {99, 12, 22, 203, 100, 4125};
        Arrays.fill(data, 778);
        System.out.println("Bütün elementlər: " + Arrays.toString(data));
    }
}
