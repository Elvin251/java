package Lesson43Practıce;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Iterating through elements:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
