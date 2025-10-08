package Lesson42Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambda", "stream");


        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperWords);
    }
}
