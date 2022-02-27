package com.augustine;

public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declaredMajor, double gpa, int expectedYearToGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }
    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }

    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2024);
        StudentProfile studentB = new StudentProfile("Max", "Tiffen", "Computer Science", 3.95, 2023);
        studentA.incrementExpectedGraduationYear();
        System.out.println(studentB.expectedYearToGraduate);
    }
}
