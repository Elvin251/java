package Lesson45Homework.Task1;

import java.util.*;
import java.util.stream.*;

public class MapSortingByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ali", 30);
        map.put("Leyla", 20);
        map.put("Rauf", 25);

        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("Sorted Map by Values: " + sortedMap);
    }
}
