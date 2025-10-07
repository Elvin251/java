package Lesson41;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Cəm: " + sum);
    }
}
