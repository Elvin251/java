package Lesson41;

import java.util.*;
import java.util.function.Predicate;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, -1, 0, 2, 5);
        Predicate<Integer> isPositive = n -> n > 0;

        numbers.stream()
                .filter(isPositive)
                .forEach(System.out::println);
    }
}
