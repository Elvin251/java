package Lesson44Practice.Map;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");

        int key = 2;
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists in the map.");
        } else {
            System.out.println("Key " + key + " does not exist.");
        }
    }
}
