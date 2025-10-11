package Lesson43Practıce.Set;

import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("Yellow", "Red", "Blue", "Green"));
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Converted TreeSet: " + treeSet);
    }
}
