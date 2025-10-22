package Lesson45Homework.Task1;

import java.util.*;

public class ListChunking {
    public static List<List<Integer>> chunkList(List<Integer> list, int chunkSize) {
        List<List<Integer>> chunks = new ArrayList<>();
        for (int i = 0; i < list.size(); i += chunkSize) {
            chunks.add(list.subList(i, Math.min(i + chunkSize, list.size())));
        }
        return chunks;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        List<List<Integer>> chunks = chunkList(numbers, 3);
        System.out.println("Chunks: " + chunks);
    }
}
