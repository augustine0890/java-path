package com.augustine.challenges;

import java.util.Scanner;

public class PasswordComplexity {
    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean upperCase = !password.equals(password.toLowerCase());
        boolean lowerCase = !password.equals(password.toUpperCase());
        boolean hasNumber = false;
        for (int i = 0; i < password.length() || !hasNumber; i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
            }
        }
        return hasNumber && upperCase && lowerCase;
/*
        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
*/
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " + isPasswordComplex(userInput));
    }
}
