package Lesson43Practıce.Set;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.add("Yellow");

        System.out.println("HashSet: " + colors);
    }
}
