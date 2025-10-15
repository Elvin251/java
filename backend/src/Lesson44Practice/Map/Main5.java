package Lesson44Practice.Map;
import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Is map empty? " + map.isEmpty());

        map.put(1, "Red");
        System.out.println("Is map empty now? " + map.isEmpty());
    }
}
