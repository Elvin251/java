package Lesson45Homework.Task1;

import java.util.*;

public class MapBasics {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Azerbaijan", "Baku");
        countries.put("Turkey", "Ankara");
        countries.put("Japan", "Tokyo");

        System.out.println("Countries and capitals: " + countries);
    }
}
