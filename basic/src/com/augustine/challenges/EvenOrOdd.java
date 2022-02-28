package com.augustine.challenges;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int n) {
        return n % 2 == 0;
        // return (n & 1) == 0;
    }

    public static boolean isEven2(int n) {
        while (n > 2) {
            n -= 2;
        }
        if (n == 2 || n == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(userNum));
        System.out.println("Is the number even? " + isEven2(userNum));
    }
}

