package com.augustine.ds;

import java.util.Arrays;

public class ArrayExamples {
    public static void toUpperCase(String[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
    }

    public static void incrementArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] += 1;
        }
    }

    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Mon", "Tue", "Wed"};
        System.out.println(Arrays.toString(weekdays));

        for (String day: weekdays) {
            System.out.println("Week day: " + day);
        }

        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));

        String[] input = new String[]{"cat", "dog", "fish"};
        toUpperCase(input);
        System.out.println((Arrays.toString(input)));

        int[] inputInt = new int[]{0, 1, 2, 3};
        incrementArray(inputInt);
        System.out.println(Arrays.toString(inputInt));
    }
}
