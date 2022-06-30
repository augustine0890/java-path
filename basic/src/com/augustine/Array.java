package com.augustine;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i=0; i<=numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"Adam", "David", "Leo", "Tom"};
        // for-each loop
        for (String n: names) {
            System.out.println(n);
        }
    }
}