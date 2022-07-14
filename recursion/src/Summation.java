public class Summation {
    public static void main(String[] args) {
        System.out.println("The sum: " + sumAll(5));
        System.out.println("The sum: " + sumAllRecursive(5));
    }

    public static int sumAll(int n) {
        return n*(n+1)/2;
    }

    public static int sumAllRecursive(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumAllRecursive(n-1);
    }
}
