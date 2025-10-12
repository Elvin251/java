package Lesson43Practıce;

import java.util.*;

public class Example11 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Collections.reverse(colors);
        System.out.println("Reversed list: " + colors);
    }
}
