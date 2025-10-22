package Lesson45Homework.Task1;

import java.util.*;

public class SetWithCustomComparator {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length));
        set.add("Apple");
        set.add("Kiwi");
        set.add("Banana");
        set.add("Mango");

        System.out.println("Strings ordered by length: " + set);
    }
}
