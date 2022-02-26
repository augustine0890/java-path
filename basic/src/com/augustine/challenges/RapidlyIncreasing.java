package com.augustine.challenges;

public class RapidlyIncreasing {
    public static int isRapidlyIncreasing(int[] a) {
        if (a.length == 1)
            return 1;

        int currentSum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > currentSum * 2) {
                currentSum += a[i];
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 9, 27};
        System.out.println("Is Rapidly Increasing " + isRapidlyIncreasing(arr1));
        int[] arr2 = {1, 3, 200, 500};
        System.out.println("Is Rapidly Increasing " + isRapidlyIncreasing(arr2));
        int[] arr3 = {1, 3, 9, 26};
        System.out.println("Is Rapidly Increasing " + isRapidlyIncreasing(arr3));
        int[] arr4 = {1, 3, 7, 26};
        System.out.println("Is Rapidly Increasing " + isRapidlyIncreasing(arr4));
        int[] arr5 = {1, 3, 8, 26};
        System.out.println("Is Rapidly Increasing " + isRapidlyIncreasing(arr5));
    }
}
