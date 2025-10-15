package Lesson44Practice.Map;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");

        HashMap<Integer, String> copy = (HashMap<Integer, String>) map.clone();
        System.out.println("Original map: " + map);
        System.out.println("Shallow copy: " + copy);
    }
}
