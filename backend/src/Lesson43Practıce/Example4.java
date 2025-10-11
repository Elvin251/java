package Lesson43Practıce;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        String color = colors.get(2);
        System.out.println("Element at index 2: " + color);
    }
}
