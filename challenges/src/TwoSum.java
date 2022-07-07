import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 8};
        int k = 11;
        System.out.println(Arrays.toString(solve(nums, k)));
    }

    public static int[] solve(int[] array, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i=0; i<array.length; i++) {
            int second = k - array[i];
            if (hashMap.containsKey(array[i])) {
                return new int[]{hashMap.get(array[i]), i};
            }
            hashMap.put(second, i);
        }
        return new int[]{};
    }
}
