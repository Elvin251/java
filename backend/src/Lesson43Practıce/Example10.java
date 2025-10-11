package Lesson43Practıce;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Collections.shuffle(colors);

        System.out.println("Shuffled list: " + colors);
    }
}
