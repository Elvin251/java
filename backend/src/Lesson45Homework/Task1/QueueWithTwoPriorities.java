package Lesson45Homework.Task1;

import java.util.*;

class PriorityItem implements Comparable<PriorityItem> {
    String value;
    int priority;
    PriorityItem(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }
    public int compareTo(PriorityItem other) {
        return Integer.compare(this.priority, other.priority);
    }
    public String toString() {
        return value + "(P" + priority + ")";
    }
}

public class QueueWithTwoPriorities {
    public static void main(String[] args) {
        PriorityQueue<PriorityItem> pq = new PriorityQueue<>();
        pq.add(new PriorityItem("Task1", 2));
        pq.add(new PriorityItem("Task2", 1));
        pq.add(new PriorityItem("Task3", 2));
        pq.add(new PriorityItem("Task4", 1));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
