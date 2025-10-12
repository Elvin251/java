package Lesson43Practıce;

import java.util.*;

public class Example16 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        ArrayList<String> cloned = (ArrayList<String>) list1.clone();

        System.out.println("Original: " + list1);
        System.out.println("Cloned: " + cloned);
    }
}
