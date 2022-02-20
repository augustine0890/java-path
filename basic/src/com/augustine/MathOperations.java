package com.augustine;

public class MathOperations {
    public static void main(String[] args) {
        int three = 3;
        int six = 6;
        int add = three + six;
        System.out.println(add);
        System.out.println(six - three);
        System.out.println(11 % 3);
        System.out.println(11 / 3);

        // Comparison Operators
        int myAge = 32;
        int yourAge = 29;
        String name = "Augustine";
        System.out.println(myAge > yourAge);
        System.out.println(myAge == yourAge);
        System.out.println(myAge >= yourAge);
        System.out.println(myAge != yourAge);
        System.out.println(myAge <= yourAge);
        System.out.println("Name contains 'A' letter: " + name.contains("A"));
    }
}
