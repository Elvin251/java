package Lesson45Homework.Task1;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("Original List: " + list);
        System.out.println("Set without duplicates: " + set);
    }
}
