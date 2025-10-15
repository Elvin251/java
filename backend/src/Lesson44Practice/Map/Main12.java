package Lesson44Practice.Map;

import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        Collection<String> values = map.values();
        System.out.println("Collection of values: " + values);
    }
}
