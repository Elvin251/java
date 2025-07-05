package Lesson24Practice;
import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        int[] nums = {99, 12, 22, 203, 100, 4125};
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, 203);

        System.out.println("203 ədədi index: " + index);
    }
}
