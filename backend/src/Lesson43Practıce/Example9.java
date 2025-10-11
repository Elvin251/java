package Lesson43Practıce;

import java.util.*;

public class Example9 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        ArrayList<String> list2 = new ArrayList<>(list1);

        System.out.println("Copied list: " + list2);
    }
}
