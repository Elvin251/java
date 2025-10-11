package Lesson43Practıce.Set;

import java.util.*;

public class Example7 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        String[] array = colors.toArray(new String[colors.size()]);

        System.out.println("Array elements:");
        for (String color : array) {
            System.out.println(color);
        }
    }
}
