package Lesson44Practice.Queen;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.addAll(pq1);

        System.out.println("First Queue: " + pq1);
        System.out.println("Second Queue after adding: " + pq2);
    }
}
