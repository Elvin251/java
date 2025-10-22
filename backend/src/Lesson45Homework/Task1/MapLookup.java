package Lesson45Homework.Task1;

import java.util.*;

public class MapLookup {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Azerbaijan", "Baku");
        countries.put("Turkey", "Ankara");
        countries.put("Japan", "Tokyo");

        String country = "Turkey";
        String capital = countries.get(country);

        System.out.println("The capital of " + country + " is " + capital);
    }
}
