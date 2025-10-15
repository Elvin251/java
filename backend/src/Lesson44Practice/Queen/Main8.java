package Lesson44Practice.Queen;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        System.out.println("First element (peek): " + pq.peek());
    }
}
