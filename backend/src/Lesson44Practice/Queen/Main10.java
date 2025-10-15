package Lesson44Practice.Queen;

import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        String[] arr = pq.toArray(new String[0]);
        System.out.println("Array elements: " + Arrays.toString(arr));
    }
}
