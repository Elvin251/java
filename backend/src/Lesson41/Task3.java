package Lesson41;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "strawberry");
        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
