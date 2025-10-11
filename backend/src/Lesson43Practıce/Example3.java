package Lesson43Practıce;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Green", "Blue", "Yellow"));
        colors.add(0, "Red");

        System.out.println("After inserting at first position: " + colors);
    }
}
