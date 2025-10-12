package Lesson43Practıce;

import java.util.*;

public class Example13 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Green", "Blue", "Yellow"));

        ArrayList<String> result = new ArrayList<>();
        for (String s : list1) {
            result.add(list2.contains(s) ? "Yes" : "No");
        }

        System.out.println("Comparison result: " + result);
    }
}
