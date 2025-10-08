package Lesson42Practice;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        words.stream()
                .filter(w -> w.length() > 5)
                .forEach(System.out::println);
    }
}
