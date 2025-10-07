package Lesson41;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
