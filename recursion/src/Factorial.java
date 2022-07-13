public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 6 is: " + factorial(6));
    }
    private static int factorial(int n) {
        if (n==1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
