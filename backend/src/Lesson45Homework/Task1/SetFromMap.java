package Lesson45Homework.Task1;

import java.util.*;

public class SetFromMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Set of Map Entries: " + entries);
    }
}
