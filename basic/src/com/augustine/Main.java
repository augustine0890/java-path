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
    }
}
