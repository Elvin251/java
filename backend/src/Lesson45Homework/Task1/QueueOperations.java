package Lesson45Homework.Task1;

import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Removed element: " + pq.poll());
        System.out.println("Queue after removal: " + pq);
    }
}
