package Lesson45Homework.Task1;

import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Banana", "Mango", "Cherry"));

        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}
