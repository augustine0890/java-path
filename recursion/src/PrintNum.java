public class PrintNum {
    public static void main(String[] args) {
        printNum(5);
    }
    private static void printNum(int n) {
        if (n==0) {
            return;
        }
        printNum(n-1);
        System.out.println(n + " ");
    }
}
