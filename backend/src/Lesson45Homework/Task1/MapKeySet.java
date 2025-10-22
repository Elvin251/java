package Lesson45Homework.Task1;

import java.util.*;

public class MapKeySet {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Azerbaijan", "Baku");
        map.put("Turkey", "Ankara");
        map.put("Japan", "Tokyo");

        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);
    }
}