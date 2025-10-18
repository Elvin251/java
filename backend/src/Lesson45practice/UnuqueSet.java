package Lesson45practice;

import java.util.*;

public class UnuqueSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = new HashSet<>(numbers);

        System.out.println("Unique elements set: " + set);
    }
}
