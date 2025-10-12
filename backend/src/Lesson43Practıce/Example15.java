package Lesson43Practıce;

import java.util.*;

public class Example15 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black"));

        ArrayList<String> joined = new ArrayList<>(list1);
        joined.addAll(list2);

        System.out.println("Joined list: " + joined);
    }
}
