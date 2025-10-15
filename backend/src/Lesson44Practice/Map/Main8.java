package Lesson44Practice.Map;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");

        String value = "Green";
        if (map.containsValue(value)) {
            System.out.println("Value '" + value + "' exists in the map.");
        } else {
            System.out.println("Value '" + value + "' does not exist.");
        }
    }
}
