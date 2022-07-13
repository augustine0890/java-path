public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator(15, 95);

        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}
