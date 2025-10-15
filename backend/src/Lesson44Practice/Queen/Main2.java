package Lesson44Practice.Queen;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        System.out.println("Iterating elements:");
        for (String color : pq) {
            System.out.println(color);
        }
    }
}
