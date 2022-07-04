package com.augustine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        System.out.println("My name is Augustine");

        String greeting = "Hi, ";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(greeting + text);

        Double num = scanner.nextDouble();
        System.out.println(num);

        int m = 10, n = 20;
        System.out.println("Before swap: numOne = " + m + " numTwo = " + n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("After swap: numOne = " + m + " numTwo = " + n);

        Integer[] numbers = {1, 23, 43, 55, 23};
        System.out.println(sum(numbers));

        String[] strings = {"Daily", "Coding", "Problem"};
        System.out.println(sum(strings));
    }

    public static Integer sum(Integer[] arr) {
        Integer sum = 0;
        for (int k=0; k<arr.length; k++) {
            sum += arr[k];
        }
        return sum;
    }

    public static String sum(String[] arr) {
        String sum = "";
        for (int k=0; k<arr.length; k++) {
            sum += arr[k];
        }
        return sum;
    }
}
