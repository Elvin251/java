package Lesson45practice;

import java.util.*;

public class MargeLists {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");

        List<String> merged = new ArrayList<>(list1);
        merged.addAll(list2);

        System.out.println("Merged list: " + merged);
    }
}
