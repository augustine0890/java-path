package com.augustine;

import java.util.Scanner;

public class AverageGPA {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many course do you have in this semester?");
        int numCourses = scanner.nextInt();

        Double[] scores = new Double[numCourses];
        System.out.println("Please enter the score: ");
        for (int i = 0; i < numCourses; i++) {
            double score = scanner.nextDouble();
            if (score > 100 || score < 0) {
                System.out.println("Invalid score");
                break;
            }
            scores[i] = score;
        }

        double sum = 0.0;
        for (int i = 0; i < numCourses; i++) {
            sum += scores[i];
        }

        double average = sum/numCourses;
        System.out.println("Your average is: " + average);

        if (average > 90) {
            System.out.println("You have A grade.");
        } else if (90 >= average && average > 80) {
            System.out.println("You have B grade.");
        } else if (80 >= average && average > 70) {
            System.out.println("You have C grade.");
        } else if (70 >= average && average > 60) {
            System.out.println("You have D grade.");
        } else {
            System.out.println("You have failed.");
        }

    }
}
