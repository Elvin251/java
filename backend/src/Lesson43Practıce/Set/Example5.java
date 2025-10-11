package Lesson43Practıce.Set;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        System.out.println("Is HashSet empty? " + colors.isEmpty());

        colors.add("Red");
        System.out.println("Is HashSet empty after adding element? " + colors.isEmpty());
    }
}
