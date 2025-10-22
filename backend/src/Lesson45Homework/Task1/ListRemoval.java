package Lesson45Homework.Task1;

import java.util.*;

public class ListRemoval {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        colors.remove(1);
        System.out.println("After removal: " + colors);
    }
}
