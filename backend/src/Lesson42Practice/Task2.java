package Lesson42Practice;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 7, 10, 13, 16, 19);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
