package Lesson42Practice;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        numbers.stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(System.out::println);
    }
}
