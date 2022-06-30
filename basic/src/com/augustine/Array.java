package com.augustine;

import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers);
        for (int i=0; i<=numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"Tom", "Sam", "Leo", "Adam", "David"};
        Collections.sort(Arrays.asList(names));
        // for-each loop
        for (String n: names) {
            System.out.println(n);
        }
    }
}