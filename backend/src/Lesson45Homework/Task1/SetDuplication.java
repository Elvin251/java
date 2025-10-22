package Lesson45Homework.Task1;

import java.util.*;

public class SetDuplication {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Set: " + numbers);
        System.out.println("Duplicates are not allowed in a HashSet because it only stores unique elements.");
    }
}
