package Lesson44Practice.Queen;

import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        String str = pq.toString();
        System.out.println("PriorityQueue as String: " + str);
    }
}
