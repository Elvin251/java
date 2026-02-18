import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println("Duplikatsiz list: " + uniqueNumbers);
    }
}
