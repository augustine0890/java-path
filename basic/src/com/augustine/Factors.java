package com.augustine;

public class Factors {
    public static void main(String[] args) {
        printFactors(42);
    }

    public static void printFactors(int number) {
        int possibleFactor = 1;
        while (possibleFactor <= number) {
            if (number % possibleFactor == 0) {
                System.out.format("%d is a factor of %d\n", possibleFactor, number);
            }
            possibleFactor++;
        }
    }
}
