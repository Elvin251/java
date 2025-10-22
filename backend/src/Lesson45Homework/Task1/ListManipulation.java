package Lesson45Homework.Task1;

import java.util.*;

public class ListManipulation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
