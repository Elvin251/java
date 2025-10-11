package Lesson43Practıce.Set;

import java.util.*;

public class Example9 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));

        System.out.println("Numbers less than 7: " + numbers.headSet(7));
    }
}
