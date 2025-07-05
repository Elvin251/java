package Lesson24Practice;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        String[] cities = {"Baku", "London", "Berlin", "Paris", "Milan", "Reykyavik", "New York"};
        String[] range = Arrays.copyOfRange(cities, 1, 6);

        System.out.println("Index 1-dən 5-ə qədər: " + Arrays.toString(range));
    }
}
