package Lesson44Practice.Map;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");

        map.clear();
        System.out.println("After removing all mappings: " + map);
    }
}
