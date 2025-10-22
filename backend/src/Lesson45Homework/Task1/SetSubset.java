package Lesson45Homework.Task1;

import java.util.*;

public class SetSubset {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        boolean isSubset = setB.containsAll(setA);
        System.out.println("SetA is subset of SetB: " + isSubset);
    }
}
