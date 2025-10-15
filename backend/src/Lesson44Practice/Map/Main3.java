package Lesson44Practice.Map;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        System.out.println("Map1: " + map1);
        System.out.println("Map2 after copying: " + map2);
    }
}
