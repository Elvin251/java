package Lesson45Homework.Task1;

import java.util.*;

public class QueueComparison {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(1, 2, 3));

        boolean areEqual = q1.equals(q2);
        System.out.println("Queues are equal: " + areEqual);
    }
}
