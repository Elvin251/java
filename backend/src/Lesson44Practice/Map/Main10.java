package Lesson44Practice.Map;

import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        String value = map.get(2);
        System.out.println("Value for key 2: " + value);
    }
}
