package Lesson43Practıce;

import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Red", "Blue", "Green"));
        Collections.sort(colors);

        System.out.println("Sorted list: " + colors);
    }
}
