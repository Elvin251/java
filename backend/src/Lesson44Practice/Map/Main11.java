package Lesson44Practice.Map;

import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        Set<Integer> keys = map.keySet();
        System.out.println("Set of keys: " + keys);
    }
}
