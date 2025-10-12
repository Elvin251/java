package Lesson43Practıce;

import java.util.*;

public class Example12 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));
        List<String> subList = colors.subList(1, 4);
        System.out.println("Sublist: " + subList);
    }
}
