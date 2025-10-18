package Lesson45practice;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 3, 2, 4, 5, 6);
        Set<Integer> unique = new LinkedHashSet<>(numbers);
        System.out.println("Without duplicates: " + unique);
    }
}
