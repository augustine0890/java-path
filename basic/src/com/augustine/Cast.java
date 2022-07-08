package com.augustine;

public class Cast {
    public static void main(String[] args) {
        int numerator = 18;
        int denominator = 5;
        System.out.println((double)numerator/denominator);

        int x = 5;
        int y = 5;
        System.out.println(x++); // post-increment
        System.out.println(++y); // pre-increment

        System.out.println(x = y);
    }
}
