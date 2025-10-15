package Lesson44Practice.Queen;

import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        System.out.println("Polled element: " + pq.poll());
        System.out.println("Queue after poll: " + pq);
    }
}
