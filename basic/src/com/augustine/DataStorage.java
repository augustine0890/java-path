package com.augustine;

public class DataStorage {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Tesla"};
        System.out.println(cars[2]);
        cars[2] = "Mercedes";
        System.out.println(cars[2]);

        // Loop through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[1]);
        for (int i : myNum) {
            System.out.println(i);
        }
    }
}
