package com.augustine.challenges;

public class Power {
    public static int method1(int base, int power) {
        int result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method1(2, 4));
    }

}
