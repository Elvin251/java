package Lesson45Homework.Task1;

import java.util.*;

public class SetToQueue {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(30, 10, 50, 20));
        PriorityQueue<Integer> pq = new PriorityQueue<>(set);

        System.out.println("PriorityQueue from Set: " + pq);
    }
}
