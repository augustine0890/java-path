import java.util.Arrays;

// Given an Array of integers - reverse array in linear running time using constant memory
public class ReverseArray {
    public static void main(String[] args) {
        // int[] elements = new int[10];
        int[] elements = {1,2,3,4,5,6,7,8,9,10};
        int[] result = solve(elements);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solve(int[] nums) {
        int i = 0, j = nums.length-1;

        while (i < j ) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return  nums;
    }
}
