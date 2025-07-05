package Lesson24Practice;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        String[] cities = {"Baku", "London", "Berlin", "Paris", "Milan"};
        String[] newCities = Arrays.copyOf(cities, 7);

        newCities[5] = "Reykyavik";
        newCities[6] = "New York";

        System.out.println("Yeni massiv: " +Arrays.toString(newCities));
    }
}
