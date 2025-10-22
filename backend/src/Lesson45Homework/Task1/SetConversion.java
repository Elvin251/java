package Lesson45Homework.Task1;

import java.util.*;

public class SetConversion {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("Converted List: " + list);
    }
}
