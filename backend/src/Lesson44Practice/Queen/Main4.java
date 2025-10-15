package Lesson44Practice.Queen;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        pq.offer("Yellow");

        System.out.println("After inserting: " + pq);
    }
}
