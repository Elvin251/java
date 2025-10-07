package Lesson41;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

