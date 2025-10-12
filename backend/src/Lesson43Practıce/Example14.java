package Lesson43Practıce;

import java.util.*;

public class Example14 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.swap(colors, 0, 2);
        System.out.println("After swap: " + colors);
    }
}
