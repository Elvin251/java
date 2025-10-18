package Lesson45practice;

import java.util.*;

public class CheckSetElement {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));

        String color = "Green";
        if (set.contains(color)) {
            System.out.println(color + " is in the set.");
        } else {
            System.out.println(color + " is not in the set.");
        }
    }
}
