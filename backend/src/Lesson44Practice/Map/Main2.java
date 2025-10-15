package Lesson44Practice.Map;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("Number of key-value mappings: " + map.size());
    }
}
