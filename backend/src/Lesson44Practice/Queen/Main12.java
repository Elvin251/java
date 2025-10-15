package Lesson44Practice.Queen;

import java.util.*;

public class Main12 {
    public static void main(String[] args) {

        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(1);
        minPQ.add(8);
        minPQ.add(3);

        System.out.println("Min Priority Queue: " + minPQ);

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(minPQ);

        System.out.println("Max Priority Queue: " + maxPQ);
    }
}
