package Lesson45Homework.Task1;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));


        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);


        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);


        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);
    }
}
