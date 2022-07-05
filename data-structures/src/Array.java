import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Capacity = 10
        List<String> names = new ArrayList<>();
        names.add("");
        names.add("David");
        names.add("Augustine");
        names.add("John");
        names.add("Anna");

        // O(n) time complexity
        System.out.println(names.remove(0));
        System.out.println(names.get(0));
        System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }
        int[] nums = new int[5];
        for (int i=0; i<5; i++) {
            nums[i] = i;
        }

        System.out.println(Arrays.toString(nums));
    }
}
