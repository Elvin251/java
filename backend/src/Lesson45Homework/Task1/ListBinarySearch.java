package Lesson45Homework.Task1;

import java.util.*;

public class ListBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int index = Collections.binarySearch(list, 30);

        if (index >= 0)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
