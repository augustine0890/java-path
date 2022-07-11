package com.augustine;

public class StringChar {
    public static void main(String[] args) {
        String stringNumber;
        int x = 32;

        stringNumber = String.valueOf(x);
        System.out.println("The number is " + stringNumber);

        int n = 345289467;
        System.out.println("Number of digits: " + countDigit(n));
        System.out.println("Number of digits: " + countDigitS(n));

        String s = "Thisisanexample";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println("The character at index 5 is: " + s.charAt(5));
    }

    // Time complexity: O(1), space complexity: O(number of digits)
    public static int countDigit(int number) {
        return String.valueOf(number).length();
    }

    // Time complexity: O(number of digits), space complexity: O(1)
    public static int countDigitS(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
