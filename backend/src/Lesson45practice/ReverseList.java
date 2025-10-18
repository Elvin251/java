package Lesson45practice;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        System.out.println("Original list: " + list);

        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
