package Lesson43Practıce;

import java.util.*;

public class Example18 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("Is empty? " + colors.isEmpty());

        colors.add("Red");
        System.out.println("Is empty after adding element? " + colors.isEmpty());
    }
}
