package Lesson24HomeWork;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        String[] cities = {"Tokyo", "Oslo", "Rome", "Madrid"};
        String[] newCities = Arrays.copyOf(cities, 6);
        newCities[4] = "Dubai";
        newCities[5] = "Sydney";

        System.out.println(Arrays.toString(newCities));
    }
}
