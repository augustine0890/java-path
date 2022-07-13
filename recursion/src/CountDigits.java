public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Number of digits in " + countDigits(2465240));
        System.out.println("Number of digits in " + countDigits(345289467));
    }

    public static int countDigits(int num) {
        if (num<=10) {
            return 1;
        } else {
            return 1 + countDigits(num/10);
        }
    }
}
