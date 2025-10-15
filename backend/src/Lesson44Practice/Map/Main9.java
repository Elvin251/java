package Lesson44Practice.Map;

import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Set view of mappings: " + entries);
    }
}

