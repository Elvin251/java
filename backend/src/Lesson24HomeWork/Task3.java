package Lesson24HomeWork;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        String[] cities = {"Tokyo", "Oslo", "Rome", "Madrid"};

        String[] subCities = Arrays.copyOfRange(cities, 2, 4);
        System.out.println(Arrays.toString(subCities));
    }
}
