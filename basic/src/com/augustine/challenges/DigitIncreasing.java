package com.augustine.challenges;

public class DigitIncreasing {
    public static int isDigitIncreasing(int n) {
        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int num = i;
            for (int j = 1; j <= 9; j++) {
                sum += num;
                if (sum == n) {
                    return 1;
                }
                if (sum >= n) {
                    break;
                }
                num = (num * 10) + i;
            }
        }
        return 0;
    }

    public static int isDigitIncreasing2(int n) {
        int i = 1;
        int j = 10;
        int temp = i;
        int total = i;

        while(n/i > 0) {
            temp = i + j;

            if (n/temp == 0)
                break;

            i = i + j;
            j = j * 10;
            total = total + i;
        }

//        System.out.println(n%total);
        if (n % total == 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 36;
        int n3 = 984;
        int n4 = 7404;
        int n5 = 37;
        System.out.println("Is Digit Increasing " + isDigitIncreasing2(n1));
        System.out.println("Is Digit Increasing " + isDigitIncreasing2(n2));
        System.out.println("Is Digit Increasing " + isDigitIncreasing2(n3));
        System.out.println("Is Digit Increasing " + isDigitIncreasing2(n4));
        System.out.println("Is Digit Increasing " + isDigitIncreasing2(n5));
    }
}
