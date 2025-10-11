package Lesson43Practıce.Set;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Iterating through HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
