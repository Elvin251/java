package Lesson45Homework.Task1;

import java.util.*;

public class QueueRotation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
        int front = queue.remove();
        queue.add(front);
        System.out.println("Rotated Queue: " + queue);
    }
}
