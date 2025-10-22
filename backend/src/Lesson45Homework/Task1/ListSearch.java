package Lesson45Homework.Task1;

import java.util.*;

public class ListSearch {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali", "Leyla", "Sara", "Rauf"));
        String searchName = "Sara";
        if (list.contains(searchName)) {
            System.out.println(searchName + " found in the list!");
        } else {
            System.out.println(searchName + " not found.");
        }
    }
}
