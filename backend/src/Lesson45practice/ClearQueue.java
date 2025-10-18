package Lesson45practice;

import java.util.*;

public class ClearQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Before clearing: " + queue);
        queue.clear();
        System.out.println("After clearing: " + queue);
    }
}
