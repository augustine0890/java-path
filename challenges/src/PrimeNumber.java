import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime Number: " + solve(50));
        System.out.println("Prime Number: " + solve2(50));
    }

    public static List<Integer> solve(int num) {
        List<Integer> primes = new ArrayList<>();
        if (num > 1) {
            for (int i=2; i<num; i++) {
                if (isPrime(i)) {
                    primes.add(i);
                }
            }
        }

        return primes;
    }

    // Time Complexity: O(n)
    public static boolean isPrime(int n) {
        for (int i=2; i<=n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> solve2(int num) {
        List<Integer> primes = new ArrayList<>();
        if (num > 1) {
            for (int i=2; i<num; i++) {
                if (isPrime2(i)) {
                    primes.add(i);
                }
            }
        }

        return primes;
    }
    // Time Complexity: O(sqrt(n))
    public static boolean isPrime2(int n) {
        for (int i=2; i<(int)Math.sqrt(n)+1; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
