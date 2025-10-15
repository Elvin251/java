package Lesson44Practice.Queen;
import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");

        pq.clear();
        System.out.println("Priority Queue after clearing: " + pq);
    }
}
