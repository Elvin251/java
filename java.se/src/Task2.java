import java.util.*;
public class Task2 {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        List<Integer> uniqueNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("Duplikatsiz list: " + uniqueNumbers);
    }
}
