package Lesson43Practıce.Set;

import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        HashSet<String> original = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        HashSet<String> cloned = (HashSet<String>) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}
