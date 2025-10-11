package Lesson43Practıce;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.set(1, "Black");

        System.out.println("After update: " + colors);
    }
}
