package com.augustine;

public class ControlFlow {
    public static void main(String[] args) {
        String city = "Seoul";
        if (city == "Hanoi") {
            System.out.println("The city is Hanoi");
        } else if (city == "Seoul") {
            System.out.println("The city is Seoul");
        } else {
            System.out.println("The city is " + city);
        }

        // Ternary Operator
        int num = 9;
        String msg = num >= 9
                ? "Number is greater than or equal to 9"
                : "Number is less than 9";
        System.out.println(msg);

        String msg2 = num > 9 ? "Number is greater than 9"
                : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
        System.out.println(msg2);
    }
}
