package com.augustine;

public class MethodParameters {
    // void indicates that main does not return a value.
    public static void main(String[] args) {
        printNumber(23);
        printNumber(3.1415);
        double y = Math.sqrt(32);
        System.out.println(y);

        System.out.println(square(6));
        System.out.println(isEven(5));

        System.out.println("A circle of radius two has area " + circleArea(2));

        System.out.println("Do or do not.");
        System.exit(0);
        System.out.println("There is no try.");
    }

    public static void printNumber(int x) {
        System.out.println("The (integer) number is " + x);
    }

    public static void printNumber(double x) {
        System.out.println("The (double) number is " + x);
    }

    public static double square(double x) {
        return x*x;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }
}
