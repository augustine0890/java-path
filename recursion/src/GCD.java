public class GCD {
    public static void main(String[] args) {
        System.out.println("GCD: " + gcd(36, 12));

    }

    // Greatest Common Divisor
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static int gcd2(int a, int b) {
        return b==0? (a < 0 ? -a : a) : gcd2(b, a%b);
    }
}
