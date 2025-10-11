package Lesson43Practıce.Set;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Green", "Blue", "Yellow"));


        HashSet<String> common = new HashSet<>(set1);
        common.retainAll(set2);
        System.out.println("Common elements: " + common);

        for (String s : set1) {
            System.out.println(s + " present in set2? " + set2.contains(s));
        }
    }
}
