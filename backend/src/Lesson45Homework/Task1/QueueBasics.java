package Lesson45Homework.Task1;

import java.util.*;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        queue.remove();
        queue.remove();

        System.out.println("Queue after removals: " + queue);
    }
}
