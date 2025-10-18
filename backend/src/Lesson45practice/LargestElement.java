package Lesson45practice;

import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 56, 23, 89, 34);
        int largest = Collections.max(numbers);
        System.out.println("Largest element: " + largest);
    }
}
