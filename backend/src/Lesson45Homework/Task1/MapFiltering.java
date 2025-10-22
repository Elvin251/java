package Lesson45Homework.Task1;

import java.util.*;

public class MapFiltering {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Azerbaijan", "Baku");
        countries.put("Turkey", "Ankara");
        countries.put("Armenia", "Yerevan");
        countries.put("Japan", "Tokyo");

        countries.keySet().removeIf(key -> key.startsWith("A"));
        System.out.println("Filtered Map: " + countries);
    }
}
