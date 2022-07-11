package com.augustine;

import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(2);
        System.out.println("Picked random value: " + n);
        switch (n) {
            case 1:
                System.out.println("Tails");
                break;
            case 0:
                System.out.printf("Heads");
                break;
        }
    }
}
