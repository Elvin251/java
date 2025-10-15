package Lesson44Practice.Queen;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Blue");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Red");
        pq2.add("Green");
        pq2.add("Yellow");

        for (String element : pq1) {
            if (pq2.contains(element))
                System.out.println(element + " is present in both queues");
            else
                System.out.println(element + " is not in second queue");
        }
    }
}
