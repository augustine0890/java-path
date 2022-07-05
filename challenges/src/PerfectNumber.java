import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(solve(6));
        System.out.println(solve(28));
        System.out.println(solve(496));
        System.out.println(solve(16));
        System.out.println(solve(8128));
        System.out.println(solve(10000));
        System.out.println(findDivisors(7));
        System.out.println(findDivisors(24));
    }

    public static List<Integer> solve(int n) {
        final List<Integer> results = new ArrayList<>();
        int sum = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
                results.add(i);
            }
        }
        if (n == sum) {
            return  results;
        }
        return new ArrayList<>();
    }

    public static List<Integer> findDivisors(final int value) {
        final List<Integer> results = new ArrayList<>();
        for (int i = 1; i < value/2; i++) {
            if (value % i == 0) {
                results.add(i);
            }
        }
        return results;
    }
}
