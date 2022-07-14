public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.print("Fibonacci sequence:");
        for (int i=0; i<=n; i++) {
            System.out.printf(" %d", fib(i));
        }
    }

    public static int fib(int n) {
        if (n<=1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
