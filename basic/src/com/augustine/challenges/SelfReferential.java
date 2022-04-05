package com.augustine.challenges;

import java.util.HashMap;
import java.util.Map;

public class SelfReferential {
    public static int isSelfReferential(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int v : a) {
                if (v == i) {
                    count++;
                }
            }
            if (count != a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static int isSelfReferential2(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.get(Integer.valueOf(a[i])) == null) {
                map.put(Integer.valueOf(a[i]), Integer.valueOf(1));
            } else {
                map.put(Integer.valueOf(a[i]), map.get(Integer.valueOf(a[i])) + 1);
            }
        }

        for (int i = 0; i < a.length; i++) {
            Integer currentI = Integer.valueOf(a[i]);
            Integer storeValue = map.get(Integer.valueOf(i));
            if (storeValue == null)
                storeValue = Integer.valueOf(0);

            if (!currentI.equals(storeValue))
                return 0;
        }

        return 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 0};
        System.out.println("Is Rapidly Increasing " + isSelfReferential2(arr1));
        int[] arr2 = {2, 0, 2, 0};
        System.out.println("Is Rapidly Increasing " + isSelfReferential2(arr2));
        int[] arr3 = {2, 1, 2, 0, 0};
        System.out.println("Is Rapidly Increasing " + isSelfReferential2(arr3));
        int[] arr4 = {3, 2, 1, 1, 0, 0, 0} ;
        System.out.println("Is Rapidly Increasing " + isSelfReferential2(arr4));
        int[] arr5 = {4, 2, 1, 0, 1, 0, 0, 0};
        System.out.println("Is Rapidly Increasing " + isSelfReferential2(arr5));
    }
}
