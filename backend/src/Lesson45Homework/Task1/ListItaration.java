package Lesson45Homework.Task1;

import java.util.*;

public class ListItaration {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Sara");
        names.add("Elvin");
        names.add("Leyla");
        names.add("Rauf");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
